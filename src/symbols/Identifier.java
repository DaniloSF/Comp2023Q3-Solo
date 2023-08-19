package symbols;

public class Identifier {
	private String text;
	private DataType type;
	private Object value;
	private boolean used = false;

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public DataType getType() {
		return type;
	}

	public void setType(DataType type) {
		this.type = type;
	}

	public Identifier(String text, DataType type) {
		super();
		this.text = text;
		this.type = type;
	}

	public Identifier() {
		super();
	}

	@Override
	public String toString() {
		return "Identifier [text=" + text + ", type=" + type + ", value=" + value + "]";
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object object) {
		this.value = object;
	}

}
