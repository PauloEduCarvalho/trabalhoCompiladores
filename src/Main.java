import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) {
        // Código para gerar a árvore sintática (parse tree)
        CharStream input = CharStreams.fromString("seu código aqui");
        CPPLexer lexer = new CPPLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CPPParser parser = new CPPParser(tokens);
        CPPParser.ProgramaContext tree = parser.programa();

        // Cria o listener e o walker
        //SymbolTable symbolTable = new SymbolTable();
        //SemanticAnalyzerListener listener = new SemanticAnalyzerListener(symbolTable);
        //ParseTreeWalker walker = new ParseTreeWalker();

        // Percorre a árvore com o listener
        //walker.walk(listener, tree);

        // Exibe os erros e dados coletados
        //listener.reportErrors();
        //listener.exibirDados();
    }
}