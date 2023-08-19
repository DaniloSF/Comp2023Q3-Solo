package ast;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import symbols.SymbolTable;

public class Program {

	private String filename;
	private List<AbstractCommand> commands;
	private SymbolTable symbolTable;

	public Program() {
		this.filename = "output.c";
		this.commands = new ArrayList<AbstractCommand>();
	}

	public void generateTarget() {
		try {
			FileWriter fw = new FileWriter(filename);
			PrintWriter pw = new PrintWriter(fw);
			StringBuilder strBuilder = new StringBuilder();
			
			strBuilder.append("#include <stdio.h>\n");

			strBuilder.append("int main() {\n");
			
			strBuilder.append(symbolTable.generateCode());
			commands.stream().forEach(c -> {
				System.out.print(c.generateCode());
				strBuilder.append(c.generateCode());
			});

			strBuilder.append("return 0;\n");
			strBuilder.append("}\n");

			pw.println(strBuilder.toString());
			pw.close();
			fw.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public List<AbstractCommand> getCommands() {
		return commands;
	}

	public void setCommands(List<AbstractCommand> commands) {
		this.commands = commands;
	}

	public SymbolTable getSymbolTable() {
		return symbolTable;
	}

	public void setSymbolTable(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}

	public void run() {
		RuntimeEntity runtime = new RuntimeEntity();
		runtime.updateContent(symbolTable.getSymbols().values());
		commands.stream().forEach(c -> {
			c.run();
			runtime.updateContent(symbolTable.getSymbols().values());
		});
	}

}
