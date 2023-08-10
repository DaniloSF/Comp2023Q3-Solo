grammar CompIsiLang;

@header {
	import java.util.ArrayList;
	import java.util.List;
	import symbols.DataType;
	import java.util.Stack;
	import symbols.Identifier;
	import symbols.SymbolTable;
	import expressions.*;
	import ast.*;
	
}

@members {
	private SymbolTable symbolTable = new SymbolTable();
	private DataType currentType;
	private AbstractExpression expression;
	private String operator;
	private DataType leftDT;
	private DataType rightDT;
	private String   idAtribuido;
	private String   text;
	private Program  program = new Program();
	private Stack<List<AbstractCommand>> stack = new Stack<List<AbstractCommand>>();
	
	public void init(){
		program.setSymbolTable(symbolTable);
		stack.push(new ArrayList<AbstractCommand>());
	}
		
	public void exibirID(){
		symbolTable.getSymbols().values().stream().forEach((id)->System.out.println(id));
	}
	
	public void generateObjectCode(){
		program.generateTarget();
	}
	
	public void runInterpreter(){
		program.run();
	}
}
programa:
	'programa' decl+ bloco 'fimprog.' {
        program.setComandos(stack.pop());
    };

decl: tipo lista_var PF;

bloco: (cmd PF)+;

tipo:
	'INTEGER' { currentType = DataType.INTEGER; }
	| 'REAL' { currentType = DataType.REAL; };

lista_var:
ID {
    Identifier id = symbolTable.get(_input.LT(-1).getText());
    if (id != null){
        throw new RuntimeException("Variable Already Declared");
    }
    symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType));
} (
    VIRG ID
    {
    id = symbolTable.get(_input.LT(-1).getText());
    if (id != null){
        throw new RuntimeException("Variable Already Declared");
    }
    symbolTable.add(_input.LT(-1).getText(), new Identifier(_input.LT(-1).getText(), currentType));
    }
)*;

cmd: cmdAttr | cmdRead | cmdWrite | cmdIf;

cmdIf:
	'se' {
            stack.push(new ArrayList<AbstractCommand>());
            BinaryExpression _relExpr = new BinaryExpression();
            CmdIf _cmdIf = new CmdIf();
        } AP expr {
            _relExpr.setLeftSide(expression);
        } OPREL {
            _relExpr.setOperator(_input.LT(-1).getText());
        } expr {
            _relExpr.setRightSide(expression);
            _cmdIf.setExpr(_relExpr);

        } FP 'entao' AC bloco FC {
            _cmdIf.setListaTrue(stack.pop());
        }
        ('senao' AC {
            stack.push(new ArrayList<AbstractCommand>());
        } bloco {
            _cmdIf.setListaFalse(stack.pop());
        } FC)?
        {
            stack.peek().add(_cmdIf);
        }
        ;


cmdRead:
	'leia' AP ID
	{
        Identifier id = symbolTable.get(_input.LT(-1).getText());
        if (id == null){
            throw new RuntimeException("Undeclared Variable");
        }
        CmdRead _read = new CmdRead(id);
        stack.peek().add(_read);
    } FP;

cmdWrite:
	'escreva' AP (
		ID {
	         	Identifier id = symbolTable.get(_input.LT(-1).getText());
	         	if (id == null){
	         		throw new RuntimeException("Undeclared Variable");	         		
	         	}
	         	CmdWrite _write = new CmdWrite(id);
	         	stack.peek().add(_write);
	         }
		| TEXT {
	         	CmdWrite _write = new CmdWrite(_input.LT(-1).getText());
	         	stack.peek().add(_write);
	         	
	         }
	) FP;

cmdAttr:
	ID {
        idAtribuido = _input.LT(-1).getText();
        if (!symbolTable.exists(_input.LT(-1).getText())){
            throw new RuntimeException("Semantic ERROR - Undeclared Identifier");
        }
        leftDT = symbolTable.get(_input.LT(-1).getText()).getType();
        rightDT = null;
    } ATTR expr {
        // logica para atribuir o valor da expressao no identificador
        Identifier id = symbolTable.get(idAtribuido);
        id.setValue(expression.eval());
        symbolTable.add(idAtribuido, id);

        //System.out.println("EVAL ("+expression+") = "+expression.eval());

        CmdAttrib _attr = new CmdAttrib(id, expression);
        stack.peek().add(_attr);
        expression = null;
    };

expr: termo exprl*;

termo:
	number {
	    System.out.println("WOW!");
	    if (leftDT != rightDT){
            throw new RuntimeException("Semantic ERROR - Type Mismatching in line " + _input.LT(-1).getLine()+" "+leftDT+ "-"+rightDT);
        }
        expression = new NumberExpression(_input.LT(-1).getText(), rightDT);
    }
	| ID {
        if (!symbolTable.exists(_input.LT(-1).getText())){
            throw new RuntimeException("Semantic ERROR - Undeclared Identifier: "+_input.LT(-1).getText());
        }
        rightDT = symbolTable.get(_input.LT(-1).getText()).getType();
        if (leftDT != rightDT){
            throw new RuntimeException("Semantic ERROR - Type Mismatching in line " + _input.LT(-1).getLine()+" "+leftDT+ "-"+rightDT);
        }

        Identifier id = symbolTable.get(_input.LT(-1).getText());
        expression = new IDExpression(id, id.getValue());
    };

exprl:
(SUM | SUB) {
    operator = _input.LT(-1).getText();
    BinaryExpression _exprADD = new BinaryExpression(operator);
    _exprADD.setLeftSide(expression);
} termo {
    _exprADD.setRightSide(expression);
    expression = _exprADD;
};

fragment DIGIT: [0-9];
number: INT { rightDT = DataType.INTEGER;}
        | FLOAT { rightDT = DataType.REAL; };
FLOAT: DIGIT+ '.' DIGIT+ ;
INT: DIGIT+ ;

TEXT: '"' ([a-z] | [A-Z] | DIGIT | ' ' | '\t' | '!' | '-')* '"';

ATTR: ':=';

SUM: '+';

SUB: '-';

OPREL: '>' | '>=' | '<' | '<=' | '==' | '<>';

ID: [a-z] ([a-z] | [A-Z] | DIGIT)*;

VIRG: ',';

PF: '.';

AP: '(';
FP: ')';

AC: '{';
FC: '}';

BLANK: (' ' | '\t' | '\n' | '\r') -> skip; 