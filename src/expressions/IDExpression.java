package expressions;

import symbols.Identifier;

public class IDExpression extends AbstractExpression{
	private Identifier id;
	private double value;

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		this.id = id;
	}

	public double getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public IDExpression(Identifier id, double value) {
		this.id = id;
		this.value = value;
	}

	public double eval() {
		return this.value;
	}
	
	public String toString() {
		return this.id.getText();
	}
}
