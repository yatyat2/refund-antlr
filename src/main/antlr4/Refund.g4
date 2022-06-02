grammar Refund;

expression
    : refundRule
    | expression expression
    ;

refundRule
    : beginDate'|'endDate'|'feeRate
    | endDate'|'feeRate
    | beginDate'|'feeRate
    ;

beginDate
    : beginDDay meetingOrder
    ;

beginDDay
    : 'begin:'dDay
    ;

endDate
    : endDDay meetingOrder
    ;

endDDay
    : 'end:'dDay
    ;

dDay
    : 'D'sign NUMBER
    | 'D'sign NUMBER
    ;

meetingOrder
    : 'of'NUMBER
    ;

feeRate
    : NUMBER'%'
    ;

sign
    : PLUS
    | MINUS
    ;

/*
 * Lexer Rules
 */

PLUS
    : '+'
    ;

MINUS
    : '-'
    ;

NUMBER
    : [0-9]+
    ;

WHITESPACE
    : ' ' -> skip
    ;