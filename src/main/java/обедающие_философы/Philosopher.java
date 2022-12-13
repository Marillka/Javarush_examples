package обедающие_философы;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {

    private Semaphore semaphore;

    // поел ли философ
    private boolean full = false;

    private String name;

    Philosopher(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    public void run() {
        try {
            if (!full) {
                // Запрашиваем у семафора разрешение на выполнение
                semaphore.acquire();
                System.out.println(name + " садится за стол");

                //философ есть
                sleep(300);
                full = true;

                System.out.println(name + " поел! Он выходит из-за стола");
                semaphore.release();

                // философ ушел, освободим место другим
                sleep(300);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
