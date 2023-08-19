package ast;

import javax.swing.JOptionPane;

import symbols.DataType;
import symbols.Identifier;

public class CmdRead extends AbstractCommand {

	private Identifier id;

	public CmdRead(Identifier id) {
		super();
		this.id = id;
	}

	public CmdRead() {
		super();
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		this.id = id;
	}

	@Override
	public String generateCode() {
		String dataTypeFormat;
		switch (id.getType()) {
			case BOOLEAN:
			case INTEGER:
				dataTypeFormat = "\"%d\"";
				break;
			case REAL:
				dataTypeFormat = "\"%f\"";
				break;
			case STRING:
				dataTypeFormat = "\"%s\"";
				break;
			default:
				dataTypeFormat = "\"%s\"";
				break;
		}
		return "scanf(" + dataTypeFormat + ", &" + id.getText() + ");\n";
	}

	@Override
	public void run() {
		if (id.getType() == DataType.INTEGER) {
			id.setValue(Integer.parseInt(JOptionPane.showInputDialog("Type Your Input")));
		} else if (id.getType() == DataType.REAL) {
			id.setValue(Double.parseDouble(JOptionPane.showInputDialog("Type Your Input")));
		}
	}

}
