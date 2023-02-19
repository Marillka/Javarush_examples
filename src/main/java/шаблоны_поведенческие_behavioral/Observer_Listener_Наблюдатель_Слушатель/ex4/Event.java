package шаблоны_поведенческие_behavioral.Observer_Listener_Наблюдатель_Слушатель.ex4;

public class Event {
    private final Object date;

    public Event(Object date) {
        this.date = date;
    }

    public Object getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "date=" + date +
                '}';
    }
}
