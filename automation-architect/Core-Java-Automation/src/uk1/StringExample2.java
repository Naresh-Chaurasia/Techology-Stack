package uk1;

public class StringExample2 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.hashCode());

        str = str + " How are you.";
        System.out.println(str);
        System.out.println(str.hashCode());

    }
}
