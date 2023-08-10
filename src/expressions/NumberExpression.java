package expressions;

import symbols.DataType;

public class NumberExpression extends AbstractExpression{
	
	private double numberValue;
	private DataType type;

	public NumberExpression(double numberValue, DataType type) {
		super();
		this.numberValue = numberValue;
		this.type = type;
	}

	public NumberExpression(String numberString, DataType type) {
		super();
		switch(type){
			case REAL -> this.numberValue = Double.parseDouble(numberString);
			case INTEGER -> this.numberValue = Integer.parseInt(numberString);
		}
		this.type = type;
	}

	public double getNumberValue() {
		return numberValue;
	}


	public void setNumberValue(float numberValue) {
		this.numberValue = numberValue;
	}


	public NumberExpression() {
		super();
	}

	public String toString(){
		switch(type){
			case INTEGER -> {
				return String.valueOf((int) numberValue);
			}
			case REAL -> {
				return String.valueOf(numberValue);
			}
		}
		return null;
	}


	public DataType getType() {
		return type;
	}

	public void setType(DataType type) {
		this.type = type;
	}

	@Override
	public double eval() {
		// TODO Auto-generated method stub
		return numberValue;
	}

}
