package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcuteableTest {
    public static void main(String[] args) {

        ExecutorService ex = Executors.newFixedThreadPool(2);
        Runnable r = () -> System.out.println("task1");
        Runnable r1 = () -> System.out.println("task2");
        ex.submit(r);
        ex.submit(r1);
        ex.shutdown();

    }

}
