package шаблоны_поведенческие_behavioral.Observer_Listener_Наблюдатель_Слушатель.ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        EventPool eventPool = new EventPool();
        eventPool.registerListener(new Listener() {
            @Override
            public void onEventReceived(Event x) {
                System.out.println(x);
            }
        });
        eventPool.start();
        while (in.hasNext()) {
            String s = in.next();
            eventPool.publishEvent(new Event(s));
        }
    }
}
