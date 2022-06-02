import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;


class MainTest {

//    new Meeting(LocalDateTime.of(2022, 1, 10, 00, 00, 00), 1),
//    new Meeting(LocalDateTime.of(2022, 2, 14, 00, 00, 00), 2),
//    new Meeting(LocalDateTime.of(2022, 3, 14, 00, 00, 00), 3),
//    new Meeting(LocalDateTime.of(2022, 4, 11, 00, 00, 00), 4)

    String refundRule = "end:D-5of1|100% begin:D-4of1|end:D-2of2|50% begin:D-1of2|25%";


    @Test
    void end만_있을_때의_환불규정() {
        RefundLexer refundLexer = new RefundLexer(CharStreams.fromString(refundRule));
        CommonTokenStream tokens = new CommonTokenStream(refundLexer);
        RefundParser parser = new RefundParser(tokens);
        ParseTree tree = parser.expression();
        ParseTreeWalker walker = new ParseTreeWalker();
        RefundOperationListener listener = new RefundOperationListener(LocalDateTime.of(2022, 1, 5, 23, 59));

        walker.walk(listener, tree);

        assertThat(listener.getRefundPrice()).isEqualTo(100);
    }

    @Test
    void 둘_다_있을_때의_환불규정() {
        RefundLexer refundLexer = new RefundLexer(CharStreams.fromString(refundRule));
        CommonTokenStream tokens = new CommonTokenStream(refundLexer);
        RefundParser parser = new RefundParser(tokens);
        ParseTree tree = parser.expression();
        ParseTreeWalker walker = new ParseTreeWalker();
        RefundOperationListener listener = new RefundOperationListener(LocalDateTime.of(2022, 1, 6, 0, 0));

        walker.walk(listener, tree);

        assertThat(listener.getRefundPrice()).isEqualTo(50);
    }

    @Test
    void 둘_다_있을_때의_환불규정_end() {
        RefundLexer refundLexer = new RefundLexer(CharStreams.fromString(refundRule));
        CommonTokenStream tokens = new CommonTokenStream(refundLexer);
        RefundParser parser = new RefundParser(tokens);
        ParseTree tree = parser.expression();
        ParseTreeWalker walker = new ParseTreeWalker();
        RefundOperationListener listener = new RefundOperationListener(LocalDateTime.of(2022, 2, 12, 23, 59,59));

        walker.walk(listener, tree);

        assertThat(listener.getRefundPrice()).isEqualTo(50);
    }

    @Test
    void start만_있을_때의_환불규정() {
        RefundLexer refundLexer = new RefundLexer(CharStreams.fromString(refundRule));
        CommonTokenStream tokens = new CommonTokenStream(refundLexer);
        RefundParser parser = new RefundParser(tokens);
        ParseTree tree = parser.expression();
        ParseTreeWalker walker = new ParseTreeWalker();
        RefundOperationListener listener = new RefundOperationListener(LocalDateTime.of(2022, 2, 13, 0, 0,0));

        walker.walk(listener, tree);

        assertThat(listener.getRefundPrice()).isEqualTo(25);
    }

}

// keyword
// operator + -

// define factor f
// define property f.a int

// define policy a, condtion($end < $f.a < $start) and ( $val1 == 10000), rule:price:5000
// alias a  price:50000 = ($end < $f.a < $start) and ( $val1 == 10000)
// alias b price:50000 = ($end < $val1 < $start) and ( $val1 == 10000)
// alias c price:50000 = ($end < $val1 < $start) and ( $val1 == 10000)
// alias d price:50000 = ($end < $val1 < $start) and ( $val1 == 10000)
// alias e price:50000 = ($end < $val1 < $start) and ( $val1 == 10000)
// define list = [a, b, c, d, e]