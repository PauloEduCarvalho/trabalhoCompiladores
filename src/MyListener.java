import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

import java.util.List;
import java.util.Stack;
import java.util.Map;

import java.util.HashMap;

public class MyListener extends CPPBaseListener {
    private Map<String, String> tabelaSimbolos; 

    private Stack<Map<String, String>> escopos;
    
    public MyListener() {
        tabelaSimbolos = new HashMap<>(); // Escopo global
    }



    // Adiciona um novo escopo à pilha
    private void novoEscopo() {
        escopos.push(new HashMap<>());
    }

    // Remove o escopo atual da pilha
    private void fecharEscopo() {
        if (!escopos.isEmpty()) {
            escopos.pop();
        }
    }

    // Verifica se uma variável está declarada no escopo atual ou superior
    private boolean varNoEscopo(String id) {
        for (Map<String, String> escopo : escopos) {
            if (escopo.containsKey(id)) {
                return true;
            }
        }
        return false;
    }

    // Obtém o tipo de uma variável
    private String getTipoDaVariavel(String id) {
        for (Map<String, String> escopo : escopos) {
            if (escopo.containsKey(id)) {
                return escopo.get(id);
            }
        }
        return "undefined"; // Retorna "undefined" se a variável não for encontrada
    }



    @Override
    public void enterNInicio(CPPParser.NInicioContext ctx) {
        tabelaSimbolos = new HashMap<>();
        escopos = new Stack();
        novoEscopo();

        System.out.println("Entrou na regra: "+ "NInicio" + "(" + ctx.funcao() + ")");
    }

    @Override
    public void exitNInicio(CPPParser.NInicioContext ctx) {
        // Verifica se a função principal foi definida
    
        // Exibe uma mensagem de log
        System.out.println("Saiu da regra: NInicio\n" + "(" + ctx.getText() +")");
    }

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }

    @Override
    public void enterNCriacao(CPPParser.NCriacaoContext ctx) {
        String tipo = ctx.TIPO().getText();
        String nomeVar = ctx.ID().getText();

        if (tabelaSimbolos.containsKey(nomeVar)) {
            throw new RuntimeException("Erro: Variável '" + nomeVar + "' já foi declarada.");
        }
        tabelaSimbolos.put(nomeVar, tipo);
    }   

    @Override
    public void enterNAtribuicao(CPPParser.NAtribuicaoContext ctx) {

        // Captura os tipos explicitamente
        List<String> tiposEncontrados = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            String token = ctx.getChild(i).getText();
            if (token.equals("int") || token.equals("float") || token.equals("bool") || token.equals("str") || token.equals("double")) {
                tiposEncontrados.add(token);
            }
        }

        // Verifica se há mais de um tipo na declaração
        if (tiposEncontrados.size() > 1) {
            String declaracao = ctx.getText();
            throw new RuntimeException("\n  Declaração inválida. Apenas um tipo deve ser especificado. Encontrado: '" 
                                    + declaracao + "'\n");
        }
    }

    public void adicionarSimbolo(String nome, String tipo) {
        if (tabelaSimbolos.containsKey(nome)) {
            throw new RuntimeException("Erro: Variável '" + nome + "' já foi declarada.");
        }
        tabelaSimbolos.put(nome, tipo);
    }


     @Override
    public void exitNAtribuicao(CPPParser.NAtribuicaoContext ctx) {
        
        // Extrai o nome da variável e o tipo (se houver)
        
        String id = ctx.ID().getText();
        String tipoValor = ctx.ID() != null ? ctx.ID().getText() : "undefined";
        
    
        // Verifica se a variável já foi declarada no escopo atual
        if (escopos.peek().containsKey(id)) {
            throw new RuntimeException("\n Erro: Declaração duplicada de variável ' id  '.\n");
        } else {
            String textoExpressao = ctx.expressao().getText();
            String tipoExpr;
 
            if (tabelaSimbolos.containsKey(textoExpressao.split("\\(")[0])) {
                tipoExpr = tabelaSimbolos.get(textoExpressao.split("\\(")[0]);
            } else if (textoExpressao.startsWith("\"") && textoExpressao.endsWith("\"") && textoExpressao.length() == 3 && tipoValor.contains("char")) {
                tipoExpr = "char"; // Definindo como tipo char
            }
            else {
                tipoExpr = getTipoDaExpressao(ctx.expressao());

            }
            // Verifica se o tipo da expressão é compatível com o tipo da variável
            if (!atribuicaoValida(tipoValor, tipoExpr, ctx.expressao())) {
                throw new RuntimeException("\n Erro: A variável '" + id + "' é do tipo " + tipoValor +
                        " e não pode receber o valor do tipo " + tipoExpr + ". \n");
                        
            } else {
                // Se for válido, adiciona a variável ao escopo atual
                escopos.peek().put(id, tipoValor);
                tabelaSimbolos.put(id, tipoValor); // Armazena na tabela global
            }
        }
        System.out.println("Saiu da regra: NDeclaracaoValor (" + ctx.getText() + ")");
    }

        // Método para obter o tipo da expressão
        private String getTipoDaExpressao(CPPParser.ExpressaoContext ctx) {
            if (ctx instanceof CPPParser.NExpressaoContext) {
                CPPParser.NExpressaoContext nExpr = (CPPParser.NExpressaoContext) ctx;
                if (nExpr.termo() != null && !nExpr.termo().isEmpty()) {
                    return getTipoDaExpressao(nExpr.termo(0));
                }
            }
            return "undefined";
        }


        // Método para obter o tipo de um termo
    private String getTipoDaExpressao(CPPParser.TermoContext ctx) {
        if (ctx.fator() != null && !ctx.fator().isEmpty()) {
            return getTipoDaExpressao(ctx.fator(0));
        }
        return "undefined";
    }


    private String getTipoDaExpressao(CPPParser.FatorContext ctx) {    
        if (ctx.INT() != null) {
            return "int"; // Determina se é float ou int com base no formato
        }

        if(ctx.REAL() != null) {
            return "real";
        }
        
        if (ctx.BOOL() != null) {
            String valor = ctx.BOOL().getText();
            if (valor.equals("true") || valor.equals("false")) {
                return "bool";
            }
        } // Se for um valor booleano

        if (ctx.PALAVRA() != null) return "str"; // Se for uma string literal
        
        if (ctx.ID() != null) return getTipoDaVariavel(ctx.ID().getText()); // Se for uma variável, obtém o tipo dela
        
        return "undefined"; // Caso contrário
    }




    private boolean atribuicaoValida(String tipoValor, String tipoExpr, CPPParser.ExpressaoContext ctx) {
        switch (tipoValor) {
            case "int":
                // int só pode receber valores inteiros
                return tipoExpr.equals("int");
            case "float":
                // float pode receber int ou float
                return tipoExpr.equals("int") || tipoExpr.equals("real");
            case "bool":
                // bool só pode receber true ou false
                return tipoExpr.equals("bool");
            case "letra":
                // letra só pode receber letra (exemplo: 'a')
                return tipoExpr.equals("letra");
            case "palavra":
                // str só pode receber literais de string 
                return tipoExpr.equals("palavra");
            case "void":
                // void não pode receber nenhum valor
                return false;
            default:
                // Tipo desconhecido
                return false;
        }
    }
    
    
    


    @Override
    public void enterNExpressao(CPPParser.NExpressaoContext ctx) {    
        // Verificar se a expressão contém o operador de concatenação (++)
        boolean concat = ctx.getText().contains("++");

        // Percorre todos os filhos da expressão
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            
            if (child instanceof CPPParser.TermoContext) {
                CPPParser.TermoContext termo = (CPPParser.TermoContext) child;
                String tipoTermo = null;  // Tipo do termo atual
    
                for (int j = 0; j < termo.getChildCount(); j++) {
                    ParseTree termoChild = termo.getChild(j);
                    
                    if (termoChild instanceof CPPParser.FatorContext) {
                        CPPParser.FatorContext fator = (CPPParser.FatorContext) termoChild;
                        
                        for (int k = 0; k < fator.getChildCount(); k++) {
                            ParseTree fatorChild = fator.getChild(k);
    
                            if (fatorChild instanceof TerminalNode) {
                                TerminalNode terminalNode = (TerminalNode) fatorChild;
    
                                // Se for uma expressão de concatenação (++) e o fator for um ID, verifica se está declarado
                                if (concat && terminalNode.getSymbol().getType() == CPPParser.ID) {
                                    String id = terminalNode.getText();
                                    
                                    // Verifica se a variável foi declarada antes de ser utilizada
                                    if (!varNoEscopo(id)) {
                                        System.out.println("Entrou na regra: enterNExpressao (" + ctx.getText() + ")");
                                        throw new RuntimeException("\n Erro: Variável '" + id + "' não declarada. \n");
                                    }
                                    
                                    // Obter o tipo da variável da tabela de símbolos
                                    if (tabelaSimbolos.containsKey(id)) {
                                        tipoTermo = tabelaSimbolos.get(id);  // Pega o tipo da variável
                                    } else {
                                        tipoTermo = "int";  // Exemplo de tipo padrão
                                        tabelaSimbolos.put(id, tipoTermo);
                                        System.out.println("Variável '" + id + "' adicionada à tabela de símbolos com tipo: " + tipoTermo);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }



    @Override
    public void exitNArgumentos(CPPParser.NArgumentosContext ctx) {
        fecharEscopo();
        System.out.println("Saiu da regra: exitNArgumento (" + ctx.expressao() + ")");
    }

    @Override
    public void enterNPrincipal(CPPParser.NPrincipalContext ctx) {
        // Obtém o nome da função (primeiro filho da regra)
        String nomeFuncao = ctx.getChild(0).getText();

        // Define o tipo de retorno como "void" (pois não há definição de tipo na gramática)
        String tipoRetorno = "void"; 

        // Adiciona a função principal à tabela de símbolos
        tabelaSimbolos.put(nomeFuncao, tipoRetorno);

        // Cria um novo escopo para a função principal
        novoEscopo();

        // Adiciona os parâmetros ao escopo atual (se houver)
        if (ctx.parametros() != null) {
            List<ParseTree> filhos = ctx.parametros().children;
            for (int i = 0; i < filhos.size(); i++) {
                ParseTree child = filhos.get(i);
                if (child instanceof CPPParser.TipoContext) {
                    String tipoParametro = child.getText();
                    String nomeParametro = filhos.get(i + 1).getText(); // O próximo filho deve ser o ID
                    escopos.peek().put(nomeParametro, tipoParametro);
                }
            }
        }

        // Exibe uma mensagem de log
        System.out.println("Entrou na regra: NPrincipal (" + ctx.getText() + ")");
    }

    @Override
    public void exitNPrincipal(CPPParser.NPrincipalContext ctx) {
        // Fecha o escopo da função principal
        fecharEscopo();

        // Exibe uma mensagem de log
        System.out.println("Saiu da regra: NPrincipal (" + ctx.getText() + ")");
    }


}
