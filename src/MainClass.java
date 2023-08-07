import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.CompIsiLangLexer;
import parser.CompIsiLangParser;

public class MainClass {
	public static void main(String[] args) {
		try {
			CompIsiLangLexer lexer = new CompIsiLangLexer(CharStreams.fromFileName("input.expr"));
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			CompIsiLangParser parser = new CompIsiLangParser(tokenStream);
			parser.init();
			System.out.println("Starting Expression Analysis");
			parser.programa();
			System.out.println("Compilation Successful! Good Job");

			System.out.println("-----------------------------");
			parser.exibirID();
			System.out.println("------- TARGET --------------");
			parser.generateObjectCode();
			// parser.runInterpreter();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
