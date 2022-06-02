// Generated from /Users/yatyat2/Documents/trevari/Antlr4-Refund/src/main/antlr4/Refund.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RefundParser}.
 */
public interface RefundListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RefundParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RefundParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefundParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RefundParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefundParser#refundRule}.
	 * @param ctx the parse tree
	 */
	void enterRefundRule(RefundParser.RefundRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefundParser#refundRule}.
	 * @param ctx the parse tree
	 */
	void exitRefundRule(RefundParser.RefundRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefundParser#beginDate}.
	 * @param ctx the parse tree
	 */
	void enterBeginDate(RefundParser.BeginDateContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefundParser#beginDate}.
	 * @param ctx the parse tree
	 */
	void exitBeginDate(RefundParser.BeginDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefundParser#beginDDay}.
	 * @param ctx the parse tree
	 */
	void enterBeginDDay(RefundParser.BeginDDayContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefundParser#beginDDay}.
	 * @param ctx the parse tree
	 */
	void exitBeginDDay(RefundParser.BeginDDayContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefundParser#endDate}.
	 * @param ctx the parse tree
	 */
	void enterEndDate(RefundParser.EndDateContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefundParser#endDate}.
	 * @param ctx the parse tree
	 */
	void exitEndDate(RefundParser.EndDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefundParser#endDDay}.
	 * @param ctx the parse tree
	 */
	void enterEndDDay(RefundParser.EndDDayContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefundParser#endDDay}.
	 * @param ctx the parse tree
	 */
	void exitEndDDay(RefundParser.EndDDayContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefundParser#dDay}.
	 * @param ctx the parse tree
	 */
	void enterDDay(RefundParser.DDayContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefundParser#dDay}.
	 * @param ctx the parse tree
	 */
	void exitDDay(RefundParser.DDayContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefundParser#meetingOrder}.
	 * @param ctx the parse tree
	 */
	void enterMeetingOrder(RefundParser.MeetingOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefundParser#meetingOrder}.
	 * @param ctx the parse tree
	 */
	void exitMeetingOrder(RefundParser.MeetingOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefundParser#refundPrice}.
	 * @param ctx the parse tree
	 */
	void enterRefundPrice(RefundParser.RefundPriceContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefundParser#refundPrice}.
	 * @param ctx the parse tree
	 */
	void exitRefundPrice(RefundParser.RefundPriceContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefundParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(RefundParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefundParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(RefundParser.SignContext ctx);
}