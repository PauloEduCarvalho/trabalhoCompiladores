import java.io.IOException;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;

public class ClasseLexer {
    public static void main(String[] args) {
        String filename = "/home/camily/TC/src/exemplo.txt"; 
        try {
            org.antlr.v4.runtime.CharStream input = CharStreams.fromFileName(filename);
            GramaticaLexer lexer = new GramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer); 
            GramaticaParser parser = new GramaticaParser(tokens);

            ParseTree ast = parser.inicio();

            System.out.println(ast.toStringTree());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

