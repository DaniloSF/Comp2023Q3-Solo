package expressions;

import symbols.DataType;

public abstract class AbstractExpression {

	public abstract Object eval();

	public abstract DataType getType();
}
