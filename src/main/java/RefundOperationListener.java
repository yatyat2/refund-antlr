import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RefundOperationListener extends RefundBaseListener {
    static final List<Meeting> meetings = new ArrayList<>(
            Arrays.asList(
                    new Meeting(LocalDateTime.of(2022, 1, 10, 00, 00, 00), 1),
                    new Meeting(LocalDateTime.of(2022, 2, 14, 00, 00, 00), 2),
                    new Meeting(LocalDateTime.of(2022, 3, 14, 00, 00, 00), 3),
                    new Meeting(LocalDateTime.of(2022, 4, 11, 00, 00, 00), 4)
            )
    );

    private int refundPrice = 0;
    private LocalDateTime refundedAt;

    public RefundOperationListener(LocalDateTime refundedAt) {
        this.refundedAt = refundedAt;
    }


    @Override
    public void enterRefundRule(RefundParser.RefundRuleContext ctx) {

        if (ctx.beginDate() == null) {
            Optional<Meeting> endMeeting = getMeetingbyEnd(ctx);
            LocalDateTime endOfRefundPeriod = endMeeting.get().getStartedAt().minusDays(Integer.parseInt(ctx.endDate().endDDay().dDay().NUMBER().getText())).withHour(23).withMinute(59).withSecond(59);
            if (refundedAt.isBefore(endOfRefundPeriod) || refundedAt.isEqual(endOfRefundPeriod)) {
                refundPrice = Integer.parseInt(ctx.feeRate().NUMBER().getText());
            }
        } else if (ctx.endDate() == null) {

            Optional<Meeting> beginMeeting = getMeetingByBegin(ctx);
            LocalDateTime beginOfRefundPeriod = beginMeeting.get().getStartedAt().minusDays(Integer.parseInt(ctx.beginDate().beginDDay().dDay().NUMBER().getText())).withHour(0).withMinute(0).withSecond(0);
            if (refundedAt.isAfter(beginOfRefundPeriod) || refundedAt.isEqual(beginOfRefundPeriod)) {
                refundPrice = Integer.parseInt(ctx.feeRate().NUMBER().getText());
            }
        } else {
            Optional<Meeting> beginMeeting = getMeetingByBegin(ctx);
            Optional<Meeting> endMeeting = getMeetingbyEnd(ctx);
            LocalDateTime beginOfRefundPeriod = beginMeeting.get().getStartedAt().minusDays(Integer.parseInt(ctx.beginDate().beginDDay().dDay().NUMBER().getText())).withHour(0).withMinute(0).withSecond(0);
            LocalDateTime endOfRefundPeriod = endMeeting.get().getStartedAt().minusDays(Integer.parseInt(ctx.endDate().endDDay().dDay().NUMBER().getText())).withHour(23).withMinute(59).withSecond(59);

            if ((refundedAt.isAfter(beginOfRefundPeriod) || refundedAt.isEqual(beginOfRefundPeriod)) && (refundedAt.isBefore(endOfRefundPeriod) || refundedAt.isEqual(endOfRefundPeriod))) {
                refundPrice = Integer.parseInt(ctx.feeRate().NUMBER().getText());
            }
        }
    }

    private Optional<Meeting> getMeetingByBegin(RefundParser.RefundRuleContext ctx) {
        return meetings
                .stream()
                .filter(m -> m.getOrder() == Integer.parseInt(ctx.beginDate().meetingOrder().NUMBER().getText()))
                .findFirst();
    }

    private Optional<Meeting> getMeetingbyEnd(RefundParser.RefundRuleContext ctx) {
        return meetings
                .stream()
                .filter(m -> m.getOrder() == Integer.parseInt(ctx.endDate().meetingOrder().NUMBER().getText()))
                .findFirst();
    }

    public int getRefundPrice() {
        return this.refundPrice;
    }
}
