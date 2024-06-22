package threading;

import java.util.concurrent.*;

public class ThreadTest {

    public static void main(String[] args) throws Exception {

//        //Extend
//        MyThread t=new MyThread();
//        t.start();
//
//        //runnable
//        Thread t1=new Thread(new MyRunnable());
//        t1.start();
//
//        //java8 Runnable
//        Runnable r=()->System.out.println("java8 run");
//        Thread t2=new Thread(r);
//        t2.start();
//        Counter c = new Counter();
//
//        MyThread t1 = new MyThread(c);
//        MyThread t2 = new MyThread(c);
//        t1.start();
//        //t1.join();
//        t2.start();
//        // t2.join();
//        System.out.println(c.getCount());

        Callable c= ()->  1;
//        Object res = c.call();
//        System.out.println(res);

        ExecutorService e= Executors.newFixedThreadPool(2);
        Future ee = e.submit(c);
        System.out.println(ee.get());
        e.shutdown();

    }
}
