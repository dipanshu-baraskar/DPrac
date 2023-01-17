package z;

import java.util.Random;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        for (int i = 0; i < 100; i++) {
//            Thread t = new Thread(new NumberPrinter(i));
//            t.start();
//        }

//        Need 5 random numbers using callable and Future
//        For generating random number use:
//        java.util.Random;

        ExecutorService service = Executors.newFixedThreadPool(10);
        ExecutorService service2 = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 100; i++) {
            Future future = service2.submit(new NumberPrinter(i));
            System.out.println(future.get());
        }
    }

//    SpringBoot:
//    public class Book {
//
//        private long id;
//        private String name;
//        private String title;
//    }
//    Implement the following service
//
//
//
//    http://localhost:8080/
//    http://localhost:8080/findbyid/2
}
