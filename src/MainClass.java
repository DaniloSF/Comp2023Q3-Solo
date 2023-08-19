import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ast.Program;
import listener.CompIsiLangVisitorImpl;
import parser.CompIsiLangLexer;
import parser.CompIsiLangParser;

public class MainClass {
	public static void main(String[] args) {
		try {
			CompIsiLangLexer lexer = new CompIsiLangLexer(CharStreams.fromFileName("input.expr"));
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			CompIsiLangParser parser = new CompIsiLangParser(tokenStream);
			ParseTree tree = parser.programa();
			CompIsiLangVisitorImpl visitor = new CompIsiLangVisitorImpl();

			Program program = (Program) visitor.visit(tree);

			program.generateTarget();
			program.run();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
