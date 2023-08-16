package expressions;

import symbols.DataType;

public class NumberExpression extends AbstractExpression {

	private Object numberValue;
	private DataType type;

	public NumberExpression(Object numberValue, DataType type) {
		super();
		this.numberValue = numberValue;
		this.type = type;
	}

	public NumberExpression(String numberString, DataType type) {
		super();
		switch (type) {
			case REAL -> this.numberValue = Double.parseDouble(numberString);
			case INTEGER -> this.numberValue = Integer.parseInt(numberString);
			default -> throw new IllegalArgumentException("Unexpected value: " + type);
		}
		this.type = type;
	}

	public Object getNumberValue() {
		return numberValue;
	}

	public void setNumberValue(float numberValue) {
		this.numberValue = numberValue;
	}

	public NumberExpression() {
		super();
	}

	public String toString() {
		switch (type) {
			case INTEGER -> {
				return String.valueOf((int) numberValue);
			}
			case REAL -> {
				return String.valueOf(numberValue);
			}
			case BOOLEAN -> throw new UnsupportedOperationException("Unimplemented case: " + type);
			case UNKNOWN -> throw new UnsupportedOperationException("Unimplemented case: " + type);
			default -> throw new IllegalArgumentException("Unexpected value: " + type);
		}

	}

	public DataType getType() {
		return type;
	}

	public void setType(DataType type) {
		this.type = type;
	}

	@Override
	public Object eval() {
		// TODO Auto-generated method stub
		return numberValue;
	}

}
