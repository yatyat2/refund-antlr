// Generated from /Users/yatyat2/Documents/trevari/Antlr4-Refund/src/main/antlr4/Refund.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RefundParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RefundVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RefundParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RefundParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefundParser#refundRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefundRule(RefundParser.RefundRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefundParser#beginDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginDate(RefundParser.BeginDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefundParser#beginDDay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginDDay(RefundParser.BeginDDayContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefundParser#endDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndDate(RefundParser.EndDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefundParser#endDDay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndDDay(RefundParser.EndDDayContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefundParser#dDay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDDay(RefundParser.DDayContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefundParser#meetingOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeetingOrder(RefundParser.MeetingOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefundParser#refundPrice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefundPrice(RefundParser.RefundPriceContext ctx);
	/**
	 * Visit a parse tree produced by {@link RefundParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(RefundParser.SignContext ctx);
}