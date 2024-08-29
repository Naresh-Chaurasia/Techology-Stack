package india;

import java.lang.Thread;

public class ThreadMain {
    public static void main(String[] args) {

        // Thread t = Thread.currentThread();
        // String n = t.getName();
        
        String threadName1 = Thread.currentThread().getName();

        // Print the name of the current thread
        System.out.println("Current Thread Name1: " + threadName1);

        MyThread t1 = new MyThread();
        t1.start();
    }
}
