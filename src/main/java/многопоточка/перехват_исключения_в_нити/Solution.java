package многопоточка.перехват_исключения_в_нити;

/* 
Поживем - увидим
*/

public class Solution extends Thread {

    public Solution() {
        this.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                String message;
                if (e instanceof Error) message = "Нельзя дальше работать";
                else if (e instanceof Exception) message = "Надо обработать";
                else message = "Поживем - увидим";
                System.out.println(message);
            }
        });
    }


    public static void main(String[] args) {
    }
}
