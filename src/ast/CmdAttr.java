package ast;

import expressions.AbstractExpression;
import symbols.Identifier;

public class CmdAttr extends AbstractCommand {

	private Identifier id;
	private AbstractExpression expr;

	@Override
	public String generateCode() {
		return id.getText() + "=" + expr.toString() + ";\n";
	}

	public CmdAttr(Identifier id, AbstractExpression expr) {
		super();
		this.id = id;
		this.expr = expr;
	}

	public CmdAttr(Identifier id) {
		super();
		this.id = id;
	}

	public CmdAttr() {
		super();
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		this.id = id;
	}

	public AbstractExpression getExpr() {
		return expr;
	}

	public void setExpr(AbstractExpression expr) {
		this.expr = expr;
	}

	@Override
	public void run() {
		id.setValue(expr.eval());
	}

}
