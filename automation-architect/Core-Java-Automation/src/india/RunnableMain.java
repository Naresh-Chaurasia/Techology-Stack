package india;

public class RunnableMain {
    public static void main(String[] args) {
        
        MyRunnable r =  new MyRunnable();
        //r.run();

    String threadName1 = Thread.currentThread().getName();

    // Print the name of the current thread
    System.out.println("Current Thread Name1: " + threadName1);

        Thread thread1 = new Thread(r);
        thread1.start();
    }
}
