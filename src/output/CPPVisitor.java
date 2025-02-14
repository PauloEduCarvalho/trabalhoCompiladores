// Generated from CPP.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CPPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CPPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CPPParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(CPPParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(CPPParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(CPPParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(CPPParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(CPPParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(CPPParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(CPPParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#enquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquanto(CPPParser.EnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#operadorLogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorLogico(CPPParser.OperadorLogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#condicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicao(CPPParser.CondicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(CPPParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(CPPParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(CPPParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaFuncao(CPPParser.ChamadaFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(CPPParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(CPPParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#operadorComparacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorComparacao(CPPParser.OperadorComparacaoContext ctx);
}