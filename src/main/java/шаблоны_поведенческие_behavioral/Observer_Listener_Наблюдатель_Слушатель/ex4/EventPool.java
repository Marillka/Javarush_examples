package шаблоны_поведенческие_behavioral.Observer_Listener_Наблюдатель_Слушатель.ex4;

import java.util.concurrent.ConcurrentLinkedDeque;

public class EventPool {
    private Listener listener;
    private ConcurrentLinkedDeque<Event> events;
    private Thread loop;

    public EventPool() {
        events = new ConcurrentLinkedDeque<>();
    }

    public void start() {
        loop = new Thread(new Runnable() {
            @Override
            public void run() {
                EventPool.this.process();
            }
        });
        loop.setDaemon(true);
        loop.start();
    }

    public synchronized void registerListener(Listener listener) {
        this.listener = listener;
    }

    private void process() {
        while (true) {
            Event event = events.poll();
            if (event != null) {
                listener.onEventReceived(event);
            }

        }
    }

    public void publishEvent(Event event) {
        events.add(event);

    }
}
