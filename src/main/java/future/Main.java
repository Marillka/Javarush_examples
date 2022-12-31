package future;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 10; i++) {
            final int w = i + 1;
            service.execute(() -> {
                System.out.println(w + " - Begin");
                try {
                    Thread.sleep(1000 + (int) (2000 * Math.random()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(w + " - End");
            });

            Future<String> result = service.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Thread.sleep(10000);
                    return "A";
                }
            });

            try {
                System.out.println(result.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }

            service.shutdown();
        }
    }
}
