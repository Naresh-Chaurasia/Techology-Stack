package looping;

class MyThread extends Thread{
   
    public void run() {
        String mainThreadName1 = Thread.currentThread().getName();
        System.out.println("mainThreadName1="+mainThreadName1);

        long id2= Thread.currentThread().getId();
        System.out.println("id2="+id2);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i); 
        }
    }

    
}
