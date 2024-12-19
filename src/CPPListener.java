// Generated from CPP.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CPPParser}.
 */
public interface CPPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CPPParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(CPPParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(CPPParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(CPPParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(CPPParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(CPPParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(CPPParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(CPPParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(CPPParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(CPPParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(CPPParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(CPPParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(CPPParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(CPPParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(CPPParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(CPPParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(CPPParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(CPPParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(CPPParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(CPPParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(CPPParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(CPPParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(CPPParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(CPPParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(CPPParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncao(CPPParser.ChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncao(CPPParser.ChamadaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(CPPParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(CPPParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(CPPParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(CPPParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#operadorComparacao}.
	 * @param ctx the parse tree
	 */
	void enterOperadorComparacao(CPPParser.OperadorComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#operadorComparacao}.
	 * @param ctx the parse tree
	 */
	void exitOperadorComparacao(CPPParser.OperadorComparacaoContext ctx);
}