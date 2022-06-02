import java.time.LocalDateTime;

public class Meeting {
    private LocalDateTime startedAt;

    private int order;

    public Meeting(LocalDateTime startedAt, int order) {
        this.startedAt = startedAt;
        this.order = order;
    }

    public LocalDateTime getStartedAt() {
        return startedAt;
    }

    public int getOrder() {
        return order;
    }
}
