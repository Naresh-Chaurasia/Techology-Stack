package looping;

public class CallingThread {
    public static void main(String[] args) {
        //MyThread thread1 = new MyThread();
        
        Thread t1 = Thread.currentThread();
        t1.setName("my-thread");
        String name = Thread.currentThread().getName();
        System.out.println(name);

        long id1= Thread.currentThread().getId();
        System.out.println("id1="+id1);

        MyThread t2 = new MyThread();
        t2.start();
    }
}
