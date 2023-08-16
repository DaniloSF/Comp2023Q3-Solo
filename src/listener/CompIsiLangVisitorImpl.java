package listener;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import ast.AbstractCommand;
import ast.CmdAttr;
import ast.CmdIf;
import ast.CmdRead;
import ast.CmdWrite;
import ast.Program;
import expressions.AbstractExpression;
import expressions.BinaryExpression;
import expressions.IDExpression;
import expressions.NumberExpression;
import parser.CompIsiLangBaseVisitor;
import parser.CompIsiLangParser.BlockContext;
import parser.CompIsiLangParser.CmdAttrContext;
import parser.CompIsiLangParser.CmdContext;
import parser.CompIsiLangParser.CmdIfContext;
import parser.CompIsiLangParser.CmdReadContext;
import parser.CompIsiLangParser.CmdWriteContext;
import parser.CompIsiLangParser.DeclContext;
import parser.CompIsiLangParser.ExprContext;
import parser.CompIsiLangParser.ExprlContext;
import parser.CompIsiLangParser.FatorContext;
import parser.CompIsiLangParser.NumberContext;
import parser.CompIsiLangParser.ProgramaContext;
import parser.CompIsiLangParser.TermoContext;
import parser.CompIsiLangParser.TermolContext;
import parser.CompIsiLangParser.TipoContext;
import symbols.DataType;
import symbols.Identifier;
import symbols.SymbolTable;

public class CompIsiLangVisitorImpl extends CompIsiLangBaseVisitor<Object> {
    Program programa;

    @Override
    public Program visitPrograma(ProgramaContext ctx) {
        programa = new Program();
        programa.setSymbolTable(new SymbolTable());

        ctx.decl().forEach(decl -> visitDecl(decl));

        programa.setCommands(visitBlock(ctx.block()));

        return programa;
    }

    @Override
    public Object visitTipo(TipoContext ctx) {
        switch (ctx.getText()) {
            case "INTEGER":
                return DataType.INTEGER;
            case "REAL":
                return DataType.REAL;
            case "STRING":
                return DataType.STRING;
            case "BOOLEAN":
                return DataType.BOOLEAN;
            default:
                return null;
        }
    }

    @Override
    public Object visitDecl(DeclContext ctx) {
        DataType dataType = (DataType) visitTipo(ctx.tipo());
        if (dataType == null) {
            throw new RuntimeException("Tipo de dado não reconhecido");
        }
        for (TerminalNode id : ctx.lista_var().ID()) {
            programa.getSymbolTable().add(id.getText(), new Identifier(id.getText(), dataType));
        }

        return null;
    }

    @Override
    public List<AbstractCommand> visitBlock(BlockContext ctx) {
        programa.getSymbolTable().enterScope();
        List<AbstractCommand> commands = new ArrayList<AbstractCommand>();

        for (CmdContext cmd : ctx.cmd()) {
            commands.add(visitCmd(cmd));
        }

        programa.getSymbolTable().exitScope();

        return commands;
    }

    @Override
    public AbstractCommand visitCmd(CmdContext ctx) {
        if (ctx.cmdIf() != null) {
            return visitCmdIf(ctx.cmdIf());
        }
        if (ctx.cmdAttr() != null) {
            return visitCmdAttr(ctx.cmdAttr());
        }
        if (ctx.cmdRead() != null) {
            return visitCmdRead(ctx.cmdRead());
        }
        if (ctx.cmdWrite() != null) {
            return visitCmdWrite(ctx.cmdWrite());
        }
        return null;
    }

    @Override
    public CmdAttr visitCmdAttr(CmdAttrContext ctx) {
        CmdAttr cmdAttr = new CmdAttr();

        SymbolTable symbolTable = programa.getSymbolTable();
        Identifier id = symbolTable.get(ctx.ID().getText());
        if (id == null) {
            throw new RuntimeException(
                    "Variavel não declarada: " + ctx.start.getLine() + " - " + ctx.start.getCharPositionInLine());
        }

        DataType dataType = id.getType();
        AbstractExpression value = visitExpr(ctx.expr());

        if (value == null) {
            throw new RuntimeException("Tipo de dado nao reconhecido: linha " + ctx.start.getLine() + " - "
                    + ctx.start.getCharPositionInLine());
        }

        if (dataType != value.getType()) {
            throw new RuntimeException("Tipos de dados incompativeis: linha " + ctx.start.getLine() + " - "
                    + ctx.start.getCharPositionInLine());
        }

        cmdAttr.setId(id);
        cmdAttr.setExpr(value);

        return cmdAttr;
    }

    @Override
    public CmdIf visitCmdIf(CmdIfContext ctx) {
        CmdIf cmdIf = new CmdIf();

        BinaryExpression _realExpr = new BinaryExpression();
        _realExpr.setLeftSide(visitExpr(ctx.logicExpr().expr(0)));
        _realExpr.setRightSide(visitExpr(ctx.logicExpr().expr(1)));
        _realExpr.setOperator(ctx.logicExpr().op.getText());

        List<AbstractCommand> _trueCmds = visitBlock(ctx.block(0));
        List<AbstractCommand> _falseCmds = null;

        if (ctx.block().size() > 1) {
            _falseCmds = visitBlock(ctx.block(1));
        }

        cmdIf.setExpr(_realExpr);
        cmdIf.setListaTrue(_trueCmds);
        cmdIf.setListaFalse(_falseCmds);

        return cmdIf;
    }

    @Override
    public AbstractCommand visitCmdRead(CmdReadContext ctx) {
        CmdRead cmdRead = new CmdRead();

        SymbolTable symbolTable = programa.getSymbolTable();
        Identifier id = symbolTable.get(ctx.ID().getText());
        if (id == null) {
            throw new RuntimeException(
                    "Variavel não declarada: " + ctx.start.getLine() + " - " + ctx.start.getCharPositionInLine());
        }

        cmdRead.setId(id);
        return cmdRead;
    }

    @Override
    public AbstractCommand visitCmdWrite(CmdWriteContext ctx) {
        CmdWrite cmdWrite = new CmdWrite();

        if (ctx.TEXT() != null) {
            cmdWrite.setText(ctx.TEXT().getText());
        } else if (ctx.ID() != null) {
            SymbolTable symbolTable = programa.getSymbolTable();
            Identifier id = symbolTable.get(ctx.ID().getText());
            if (id == null) {
                throw new RuntimeException(
                        "Variavel não declarada: " + ctx.start.getLine() + " - " + ctx.start.getCharPositionInLine());
            }
            cmdWrite.setId(id);
        }

        return cmdWrite;
    }

    @Override
    public AbstractExpression visitExpr(ExprContext ctx) {
        AbstractExpression expression = null;
        AbstractExpression termo = visitTermo(ctx.termo());

        if (ctx.exprl().size() > 0) {
            for (ExprlContext exprl : ctx.exprl()) {
                BinaryExpression rightSide = visitExprl(exprl);
                rightSide.setLeftSide(termo);

                if (termo.getType() != rightSide.getRightSide().getType()) {
                    throw new RuntimeException("Tipos de dados incompativeis: linha " + ctx.start.getLine() + " - "
                            + ctx.start.getCharPositionInLine());
                }

                expression = rightSide;
                termo = expression;
            }
        } else {
            expression = termo;
        }

        return expression;
    }

    @Override
    public BinaryExpression visitExprl(ExprlContext ctx) {
        BinaryExpression expression = new BinaryExpression();
        AbstractExpression termo = visitTermo(ctx.termo());
        expression.setRightSide(termo);
        String operator = ctx.op.getText();
        expression.setOperator(operator);

        return expression;
    }

    @Override
    public AbstractExpression visitTermo(TermoContext ctx) {
        AbstractExpression expression = null;
        AbstractExpression fator = visitFator(ctx.fator());

        if (ctx.termol().size() > 0) {
            for (TermolContext exprl : ctx.termol()) {
                BinaryExpression rightSide = visitTermol(exprl);
                rightSide.setLeftSide(fator);

                expression = rightSide;
                fator = expression;
            }
        } else {
            expression = fator;
        }
        return expression;
    }

    @Override
    public BinaryExpression visitTermol(TermolContext ctx) {
        BinaryExpression expression = new BinaryExpression();
        AbstractExpression fator = visitFator(ctx.fator());
        expression.setRightSide(fator);
        expression.setOperator(ctx.op.getText());
        return expression;
    }

    @Override
    public AbstractExpression visitFator(FatorContext ctx) {
        if (ctx.number() != null) {
            return visitNumber(ctx.number());
        }
        if (ctx.ID() != null) {
            SymbolTable symbolTable = programa.getSymbolTable();
            Identifier id = symbolTable.get(ctx.ID().getText());
            if (id == null) {
                throw new RuntimeException(
                        "Variavel não declarada: " + ctx.start.getLine() + " - " + ctx.start.getCharPositionInLine());
            }
            return new IDExpression(id, id.getValue());
        }
        if (ctx.expr() != null) {
            return visitExpr(ctx.expr());
        }
        return null;
    }

    @Override
    public AbstractExpression visitNumber(NumberContext ctx) {
        if (ctx.INTEGER() != null) {
            return new NumberExpression(ctx.getText(), DataType.INTEGER);
        }
        if (ctx.REAL() != null) {
            return new NumberExpression(ctx.getText(), DataType.REAL);
        }
        return null;
    }
}
