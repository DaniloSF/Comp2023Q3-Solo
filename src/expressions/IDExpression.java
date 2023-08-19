package expressions;

import symbols.DataType;
import symbols.Identifier;

public class IDExpression extends AbstractExpression {
	private Identifier id;
	private Object value;

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		this.id = id;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public IDExpression(Identifier id, Object value) {
		this.id = id;
		this.value = value;
	}

	public Object eval() {
		return this.value;
	}

	public String toString() {
		return this.id.getText();
	}

	@Override
	public DataType getType() {
		return id.getType();
	}
}
