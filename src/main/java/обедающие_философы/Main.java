package обедающие_философы;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        new Philosopher(semaphore, "Сократ").start();
        new Philosopher(semaphore, "Платон").start();
        new Philosopher(semaphore, "Аристотель").start();
        new Philosopher(semaphore, "Фалес").start();
        new Philosopher(semaphore, "Пифагор").start();
    }
}
