package exam03retake02;

public class Todo {

    private String text;
    private State state = State.NON_COMPLETED;
    private int priority;

    public Todo(String text, int priority) {
        this.text = text;
        if (1 <= priority && priority <= 5) {
            this.priority = priority;
        } else {
            throw new IllegalArgumentException("Priority must be between 1 and 5");
        }
    }

    public void complete() {
        this.state = State.COMPLETED;
    }

    public String getText() {
        return text;
    }

    public State getState() {
        return state;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "text='" + text + '\'' +
                ", state=" + state +
                ", priority=" + priority +
                '}';
    }
}
