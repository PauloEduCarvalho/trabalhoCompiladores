// Generated from Gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(GramaticaParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(GramaticaParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#somaSubExp}.
	 * @param ctx the parse tree
	 */
	void enterSomaSubExp(GramaticaParser.SomaSubExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#somaSubExp}.
	 * @param ctx the parse tree
	 */
	void exitSomaSubExp(GramaticaParser.SomaSubExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#multDivExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivExpr(GramaticaParser.MultDivExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#multDivExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivExpr(GramaticaParser.MultDivExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#finalExpr}.
	 * @param ctx the parse tree
	 */
	void enterFinalExpr(GramaticaParser.FinalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#finalExpr}.
	 * @param ctx the parse tree
	 */
	void exitFinalExpr(GramaticaParser.FinalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#digitExpr}.
	 * @param ctx the parse tree
	 */
	void enterDigitExpr(GramaticaParser.DigitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#digitExpr}.
	 * @param ctx the parse tree
	 */
	void exitDigitExpr(GramaticaParser.DigitExprContext ctx);
}