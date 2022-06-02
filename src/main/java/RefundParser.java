// Generated from Refund.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RefundParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PLUS=7, MINUS=8, NUMBER=9, 
		WHITESPACE=10;
	public static final int
		RULE_expression = 0, RULE_refundRule = 1, RULE_beginDate = 2, RULE_beginDDay = 3, 
		RULE_endDate = 4, RULE_endDDay = 5, RULE_dDay = 6, RULE_meetingOrder = 7, 
		RULE_feeRate = 8, RULE_sign = 9;
	public static final String[] ruleNames = {
		"expression", "refundRule", "beginDate", "beginDDay", "endDate", "endDDay", 
		"dDay", "meetingOrder", "feeRate", "sign"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'|'", "'begin:'", "'end:'", "'D'", "'of'", "'%'", "'+'", "'-'", 
		null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "PLUS", "MINUS", "NUMBER", "WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Refund.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RefundParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public RefundRuleContext refundRule() {
			return getRuleContext(RefundRuleContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(21);
			refundRule();
			}
			_ctx.stop = _input.LT(-1);
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(23);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(24);
					expression(2);
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RefundRuleContext extends ParserRuleContext {
		public BeginDateContext beginDate() {
			return getRuleContext(BeginDateContext.class,0);
		}
		public EndDateContext endDate() {
			return getRuleContext(EndDateContext.class,0);
		}
		public FeeRateContext feeRate() {
			return getRuleContext(FeeRateContext.class,0);
		}
		public RefundRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refundRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).enterRefundRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).exitRefundRule(this);
		}
	}

	public final RefundRuleContext refundRule() throws RecognitionException {
		RefundRuleContext _localctx = new RefundRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_refundRule);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				beginDate();
				setState(31);
				match(T__0);
				setState(32);
				endDate();
				setState(33);
				match(T__0);
				setState(34);
				feeRate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				endDate();
				setState(37);
				match(T__0);
				setState(38);
				feeRate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				beginDate();
				setState(41);
				match(T__0);
				setState(42);
				feeRate();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeginDateContext extends ParserRuleContext {
		public BeginDDayContext beginDDay() {
			return getRuleContext(BeginDDayContext.class,0);
		}
		public MeetingOrderContext meetingOrder() {
			return getRuleContext(MeetingOrderContext.class,0);
		}
		public BeginDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).enterBeginDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).exitBeginDate(this);
		}
	}

	public final BeginDateContext beginDate() throws RecognitionException {
		BeginDateContext _localctx = new BeginDateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_beginDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			beginDDay();
			setState(47);
			meetingOrder();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeginDDayContext extends ParserRuleContext {
		public DDayContext dDay() {
			return getRuleContext(DDayContext.class,0);
		}
		public BeginDDayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginDDay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).enterBeginDDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).exitBeginDDay(this);
		}
	}

	public final BeginDDayContext beginDDay() throws RecognitionException {
		BeginDDayContext _localctx = new BeginDDayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_beginDDay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__1);
			setState(50);
			dDay();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndDateContext extends ParserRuleContext {
		public EndDDayContext endDDay() {
			return getRuleContext(EndDDayContext.class,0);
		}
		public MeetingOrderContext meetingOrder() {
			return getRuleContext(MeetingOrderContext.class,0);
		}
		public EndDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).enterEndDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).exitEndDate(this);
		}
	}

	public final EndDateContext endDate() throws RecognitionException {
		EndDateContext _localctx = new EndDateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_endDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			endDDay();
			setState(53);
			meetingOrder();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndDDayContext extends ParserRuleContext {
		public DDayContext dDay() {
			return getRuleContext(DDayContext.class,0);
		}
		public EndDDayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endDDay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).enterEndDDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).exitEndDDay(this);
		}
	}

	public final EndDDayContext endDDay() throws RecognitionException {
		EndDDayContext _localctx = new EndDDayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_endDDay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__2);
			setState(56);
			dDay();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DDayContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(RefundParser.NUMBER, 0); }
		public DDayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dDay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).enterDDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).exitDDay(this);
		}
	}

	public final DDayContext dDay() throws RecognitionException {
		DDayContext _localctx = new DDayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dDay);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(T__3);
				setState(59);
				sign();
				setState(60);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__3);
				setState(63);
				sign();
				setState(64);
				match(NUMBER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeetingOrderContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(RefundParser.NUMBER, 0); }
		public MeetingOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meetingOrder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).enterMeetingOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).exitMeetingOrder(this);
		}
	}

	public final MeetingOrderContext meetingOrder() throws RecognitionException {
		MeetingOrderContext _localctx = new MeetingOrderContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_meetingOrder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__4);
			setState(69);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeeRateContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(RefundParser.NUMBER, 0); }
		public FeeRateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feeRate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).enterFeeRate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).exitFeeRate(this);
		}
	}

	public final FeeRateContext feeRate() throws RecognitionException {
		FeeRateContext _localctx = new FeeRateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_feeRate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(NUMBER);
			setState(72);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(RefundParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RefundParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefundListener ) ((RefundListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\fO\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bE\n\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\2\3\2\f\2\4\6\b\n\f\16\20\22\24\2\3\3"+
		"\2\t\n\2H\2\26\3\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\b\63\3\2\2\2\n\66\3\2\2"+
		"\2\f9\3\2\2\2\16D\3\2\2\2\20F\3\2\2\2\22I\3\2\2\2\24L\3\2\2\2\26\27\b"+
		"\2\1\2\27\30\5\4\3\2\30\35\3\2\2\2\31\32\f\3\2\2\32\34\5\2\2\4\33\31\3"+
		"\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37\35\3"+
		"\2\2\2 !\5\6\4\2!\"\7\3\2\2\"#\5\n\6\2#$\7\3\2\2$%\5\22\n\2%/\3\2\2\2"+
		"&\'\5\n\6\2\'(\7\3\2\2()\5\22\n\2)/\3\2\2\2*+\5\6\4\2+,\7\3\2\2,-\5\22"+
		"\n\2-/\3\2\2\2. \3\2\2\2.&\3\2\2\2.*\3\2\2\2/\5\3\2\2\2\60\61\5\b\5\2"+
		"\61\62\5\20\t\2\62\7\3\2\2\2\63\64\7\4\2\2\64\65\5\16\b\2\65\t\3\2\2\2"+
		"\66\67\5\f\7\2\678\5\20\t\28\13\3\2\2\29:\7\5\2\2:;\5\16\b\2;\r\3\2\2"+
		"\2<=\7\6\2\2=>\5\24\13\2>?\7\13\2\2?E\3\2\2\2@A\7\6\2\2AB\5\24\13\2BC"+
		"\7\13\2\2CE\3\2\2\2D<\3\2\2\2D@\3\2\2\2E\17\3\2\2\2FG\7\7\2\2GH\7\13\2"+
		"\2H\21\3\2\2\2IJ\7\13\2\2JK\7\b\2\2K\23\3\2\2\2LM\t\2\2\2M\25\3\2\2\2"+
		"\5\35.D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}