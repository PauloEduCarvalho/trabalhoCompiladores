import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.util.List;

public class ExemploParser {

    public static void main(String[] args) {
        String filename = "codigo.txt"; // Arquivo de entrada contendo o código fonte

        try {
            // Carrega o arquivo de entrada como um CharStream
            CharStream input = CharStreams.fromFileName(filename);

            // Cria o lexer para análise léxica
            CPPLexer lexer = new CPPLexer(input);

            // Adiciona listener para erros léxicos
            lexer.removeErrorListeners(); // Remove o listener padrão
            lexer.addErrorListener(new ErrorListener("Lexer"));

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Cria o parser para análise sintática
            CPPParser parser = new CPPParser(tokens);

            // Adiciona listener para erros sintáticos
            parser.removeErrorListeners(); // Remove o listener padrão
            parser.addErrorListener(new ErrorListener("Parser"));

            // Define a regra inicial (programa) e tenta gerar a árvore sintática
            ParseTree tree = null;
            try {
                tree = parser.programa();
            } catch (RecognitionException e) {
                System.err.println("Erro de análise sintática: " + e.getMessage());
                return; // Se houver erro sintático, encerra o programa
            }

            // Exibe os tokens (análise léxica)
            System.out.println("Análise Léxica:");
            for (Token token : tokens.getTokens()) {
                System.out.println("Token: <Classe: " + lexer.getVocabulary().getSymbolicName(token.getType()) +
                        " ,Lexema: " + token.getText() + ">");
            }

            // Exibe a árvore sintática textual, caso tenha sido gerada
            if (tree != null) {
                System.out.println("\nÁrvore Sintática:");
                System.out.println(tree.toStringTree(parser)); // Representação textual da árvore
            } else {
                System.out.println("\nErro: Árvore Sintática não gerada devido a erros.");
                return; // Se a árvore não for gerada, encerra o programa
            }




        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    /**
     * Listener personalizado para erros léxicos e sintáticos.
     */
    static class ErrorListener extends BaseErrorListener {
        private final String source;

        public ErrorListener(String source) {
            this.source = source;
        }

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                int line, int charPositionInLine, String msg, RecognitionException e) {
            System.err.println("Erro em " + source + " na linha " + line + ":" + charPositionInLine + " - " + msg);
        }
    }
}
