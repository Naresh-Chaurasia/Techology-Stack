package uk1;

public class Static2 {
    public static void main(String[] args) {
        //Static2 s = new Static2();
        //s.displaySum(10, 20);

        displaySum(10,20);
        Static2.displaySum(10,20);
    }

    static void displaySum(int a , int b  ){
        System.out.println(a+b);
    }

}
