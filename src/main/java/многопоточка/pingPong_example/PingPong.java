package многопоточка.pingPong_example;

public class PingPong {
    private static volatile int current = 1;
    private Object lock = new Object();

    public void ping() throws InterruptedException {
        synchronized (lock) {
            while (current != 1) {
                lock.wait();
            }
            System.out.println("Ping");
            Thread.sleep(1000);
            current = 2;
            lock.notifyAll();
        }
    }

    public void pong() throws InterruptedException {
        synchronized (lock) {
            while (current != 2) {
                lock.wait();
            }
            System.out.println("Pong");
            Thread.sleep(1000);
            current = 1;
            lock.notifyAll();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        PingPong pingPong = new PingPong();
        Thread t1 = new Thread(() -> {
            try {
                for (int i = 0; i < 100; i++) {
                    pingPong.ping();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        Thread t2 = new Thread(() -> {
            try {
                for (int i = 0; i < 100; i++) {
                    pingPong.pong();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
