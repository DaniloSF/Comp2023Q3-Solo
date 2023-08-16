package ast;

import javax.swing.JOptionPane;

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
		// TODO Auto-generated method stub
		return id.getText() + " = " + "prompt(\"Type you input\");\n";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		id.setValue(Float.parseFloat(JOptionPane.showInputDialog("Type Your Input")));
	}

}
