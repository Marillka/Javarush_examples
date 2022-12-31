package многопоточка.threadsafe_count_with_Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeCounter {
    private Lock lock = new ReentrantLock();
    public int count = 0;

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public void print() {
        System.out.println(count);
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSafeCounter threadSafeCounter = new ThreadSafeCounter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                threadSafeCounter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                threadSafeCounter.increment();
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                threadSafeCounter.increment();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();


        threadSafeCounter.print();
    }
}
