import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;

public class SemanticAnalyzer extends CPPBaseVisitor<Void> {

    private final SymbolTable symbolTable;
    private final List<String> errors = new ArrayList<>();

    public SemanticAnalyzer(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public List<String> getErrors() {
        return errors;
    }

    @Override
    public Void visitFuncao(CPPParser.FuncaoContext ctx) {
        // Nome da função
        String funcName = ctx.ID().getText();

        // Verifica se a função já foi declarada
        if (symbolTable.lookupVariable(funcName) != null) {
            errors.add("Erro semântico: Função '" + funcName + "' já declarada.");
        } else {
            symbolTable.declareVariable(funcName, "função");
        }

        // Cria um novo escopo para a função
        symbolTable.enterScope();

        // Verifica se há parâmetros e os declara
        if (ctx.parametros() != null) {
            for (int i = 0; i < ctx.parametros().tipo().size(); i++) {
                CPPParser.TipoContext tipoCtx = ctx.parametros().tipo(i); // Acessa o tipo do parâmetro
                TerminalNode idNode = ctx.parametros().ID(i); // Acessa o ID do parâmetro
                String tipo = tipoCtx.getText(); // Obtém o texto do tipo
                String id = idNode.getText(); // Obtém o texto do ID

                // Verifica se o parâmetro já foi declarado no mesmo escopo
                if (!symbolTable.declareVariable(id, tipo)) {
                    errors.add("Erro semântico: Parâmetro '" + id + "' já declarado na função '" + funcName + "'.");
                }
            }
        }

        // Continua a visitação para outros elementos da função
        visitChildren(ctx);
        symbolTable.exitScope(); // Sai do escopo da função
        return null;
    }

    @Override
    public Void visitAtribuicao(CPPParser.AtribuicaoContext ctx) {
        String varName = ctx.ID().getText();

        // Checando se a variável foi declarada
        if (symbolTable.lookupVariable(varName) == null) {
            errors.add("Erro semântico: Variável '" + varName + "' não declarada.");
        } else {
            // Verifica o tipo da expressão de atribuição
            String tipoEsperado = symbolTable.lookupVariable(varName);
            String tipoAtribuido = inferirTipo(ctx.expressao());

            if (tipoAtribuido != null && !tipoEsperado.equals(tipoAtribuido)) {
                errors.add("Erro semântico: Tipo incompatível na atribuição de '" + varName + "'. Esperado: " + tipoEsperado + ", encontrado: " + tipoAtribuido + ".");
            }
        }

        return visitChildren(ctx);
    }


    @Override
    public Void visitRetorno(CPPParser.RetornoContext ctx) {
        // Verifica se a expressão de retorno usa variáveis não declaradas
        if (ctx.expressao() != null) {
            verificarVariaveisNaExpressao(ctx.expressao()); // Agora correto
        }
        return visitChildren(ctx);
    }



    @Override
    public Void visitCondicional(CPPParser.CondicionalContext ctx) {
        if (ctx.condicao() != null) {
            for (CPPParser.CondicaoContext condicao : ctx.condicao()) { // Agora correto
                verificarVariaveisNaCondicao(condicao);
            }
        }
        return visitChildren(ctx);
    }




    // Método para verificar variáveis em uma expressão
    private void verificarVariaveisNaExpressao(CPPParser.ExpressaoContext ctx) {
        if (ctx != null && ctx.termo() != null) {
            for (CPPParser.TermoContext termo : ctx.termo()) {
                verificarVariaveisNoTermo(termo);
            }
        }
    }


    // Método para verificar variáveis em um termo
    private void verificarVariaveisNoTermo(CPPParser.TermoContext ctx) {
        if (ctx.fator() != null) {
            for (CPPParser.FatorContext fator : ctx.fator()) {
                verificarVariaveisNoFator(fator);
            }
        }
    }

    // Método para verificar variáveis em um fator
    private void verificarVariaveisNoFator(CPPParser.FatorContext ctx) {
        if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            if (symbolTable.lookupVariable(varName) == null) {
                errors.add("Erro semântico: Variável '" + varName + "' não declarada.");
            }
        } else if (ctx.expressao() != null) {
            verificarVariaveisNaExpressao(ctx.expressao());
        }
    }

    private void verificarVariaveisNaCondicao(CPPParser.CondicaoContext ctx) {
        if (ctx.expressao() != null) {
            for (CPPParser.ExpressaoContext expressao : ctx.expressao()) { // Correção
                verificarVariaveisNaExpressao(expressao);
            }
        }
    }


    // Método para inferir o tipo de uma expressão
    private String inferirTipo(CPPParser.ExpressaoContext ctx) {
        if (ctx.termo() != null && ctx.termo().size() > 0) {
            return inferirTipoTermo(ctx.termo(0)); // Verifica o tipo do primeiro termo
        }
        return null; // Tipo desconhecido ou erro
    }

    private String inferirTipoTermo(CPPParser.TermoContext ctx) {
        if (ctx.fator() != null && ctx.fator().size() > 0) {
            return inferirTipoFator(ctx.fator(0)); // Verifica o tipo do primeiro fator
        }
        return null; // Tipo desconhecido ou erro
    }

    private String inferirTipoFator(CPPParser.FatorContext ctx) {
        if (ctx.INT() != null) {
            return "int";
        } else if (ctx.REAL() != null) {
            return "real";
        } else if (ctx.BOOL() != null) {
            return "bool";
        } else if (ctx.PALAVRA() != null) {
            return "palavra";
        } else if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            return symbolTable.lookupVariable(varName); // Retorna o tipo da variável
        } else if (ctx.expressao() != null) {
            return inferirTipo(ctx.expressao()); // Recursão para verificar expressões entre parênteses
        }
        return null; // Tipo desconhecido ou erro
    }
}