package ast;

import javax.swing.JOptionPane;

import symbols.Identifier;

public class CmdWrite extends AbstractCommand {

	private Identifier id;
	private String text;

	public CmdWrite() {
		super();
	}

	public CmdWrite(Identifier id) {
		super();
		this.id = id;
	}

	public CmdWrite(String text) {
		super();
		this.text = text;
	}

	@Override
	public String generateCode() {
		if (text != null) {
			return "printf(\"%s\", \"" + text + "\\n\");\n";
		}
		String dataTypeFormat;
		switch (id.getType()) {
			case BOOLEAN:
			case INTEGER:
				dataTypeFormat = "\"%d\\n\"";
				break;
			case REAL:
				dataTypeFormat = "\"%f\\n\"";
				break;
			case STRING:
				dataTypeFormat = "\"%s\\n\"";
				break;
			default:
				dataTypeFormat = "\"%s\\n\"";
				break;
		}
		return "printf(" + dataTypeFormat + ", " + id.getText() + ");\n";
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, (id != null ? id.getValue() : text));
	}

}
