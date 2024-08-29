package india;

public class MyRunnable implements Runnable{

    public void run() {

        String threadName2 = Thread.currentThread().getName();

        // Print the name of the current thread
        System.out.println("Current Thread Name2: " + threadName2);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
        }
    }
    
}
