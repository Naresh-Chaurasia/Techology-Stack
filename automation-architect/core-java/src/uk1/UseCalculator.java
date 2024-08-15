package uk1;

public class UseCalculator {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int s2 = c1.add(10, 20);
        System.out.println(s2);

        int s3 = c1.add(10, 20,30);

        c1.add("hello", "hai");
    }
}
