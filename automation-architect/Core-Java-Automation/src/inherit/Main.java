package inherit;



public class Main {
    public static void main(String[] args) {

        Main.sum(10, 20);
        
    }

    static void sum(int a, int b){
        System.out.println(a+b);
    }

    void substract(int a, int b){
        System.out.println(a-b);
        sum(a,b);
    }

}
