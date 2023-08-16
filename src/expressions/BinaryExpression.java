package expressions;

import symbols.DataType;

public class BinaryExpression extends AbstractExpression {

	private String operator;
	private AbstractExpression leftSide;
	private AbstractExpression rightSide;
	private DataType type;

	public Object eval() {
		switch (type) {
			case INTEGER: {
				Integer leftValue = (Integer) leftSide.eval();
				Integer rightValue = (Integer) rightSide.eval();

				switch (operator) {
					case "+":
						return (Integer) leftValue + (Integer) rightValue;
					case "-":
						return (Integer) leftValue - (Integer) rightValue;
					case "*":
						return (Integer) leftValue * (Integer) rightValue;
					case "/":
						return (Integer) leftValue / (Integer) rightValue;
					case "%":
						return (Integer) leftValue % (Integer) rightValue;
					case "==":
						return (Integer) leftValue == (Integer) rightValue;
					case "!=":
						return (Integer) leftValue != (Integer) rightValue;
					case "<":
						return (Integer) leftValue < (Integer) rightValue;
					case ">":
						return (Integer) leftValue > (Integer) rightValue;
					case "<=":
						return (Integer) leftValue <= (Integer) rightValue;
					case ">=":
						return (Integer) leftValue >= (Integer) rightValue;
					default:
						throw new RuntimeException("Invalid operator");
				}
			}

			case REAL: {
				Float leftValue = (Float) leftSide.eval();
				Float rightValue = (Float) rightSide.eval();

				switch (operator) {
					case "+":
						return leftValue + rightValue;
					case "-":
						return leftValue - rightValue;
					case "*":
						return leftValue * rightValue;
					case "/":
						return leftValue / rightValue;
					case "%":
						return leftValue % rightValue;
					case "==":
						return leftValue == rightValue;
					case "!=":
						return leftValue != rightValue;
					case "<":
						return leftValue < rightValue;
					case ">":
						return leftValue > rightValue;
					case "<=":
						return leftValue <= rightValue;
					case ">=":
						return leftValue >= rightValue;
					default:
						throw new RuntimeException("Invalid operator");
				}
			}
			default:
				throw new RuntimeException("Invalid type");
		}

	}

	public BinaryExpression(String operator, AbstractExpression leftSide, AbstractExpression rightSide) {
		super();
		this.operator = operator;
		this.leftSide = leftSide;
		this.rightSide = rightSide;
		setType(leftSide.getType());
	}

	public BinaryExpression(String operator) {
		super();
		setOperator(operator);
	}

	public BinaryExpression() {
		super();
	}

	@Override
	public String toString() {
		return leftSide.toString() + operator + rightSide.toString();
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if (operator == ">=" || operator == "<=" || operator == ">" || operator == "<" || operator == "=="
				|| operator == "!=") {
			setType(DataType.BOOLEAN);
		}
	}

	public AbstractExpression getLeftSide() {
		return leftSide;
	}

	public void setLeftSide(AbstractExpression leftSide) {
		this.leftSide = leftSide;
		if (type != DataType.BOOLEAN)
			setType(leftSide.getType());
	}

	public AbstractExpression getRightSide() {
		return rightSide;
	}

	public void setRightSide(AbstractExpression rightSide) {
		this.rightSide = rightSide;
	}

	@Override
	public DataType getType() {
		return type;
	}

	public void setType(DataType type) {
		this.type = type;
	}

}
