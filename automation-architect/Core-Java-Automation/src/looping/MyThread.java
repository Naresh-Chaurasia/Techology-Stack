package looping;

class MyThread extends Thread{
   
    public void run() {
        String mainThreadName1 = Thread.currentThread().getName();
        System.out.println("mainThreadName1="+mainThreadName1);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i); 
        }
    }

    
}
