package uk1;

public class SBuf {
    public static void main(String[] args) {
        // Creating a StringBuffer with an initial string
        StringBuffer buffer3 = new StringBuffer("Hello, World!");

        System.out.println(buffer3.hashCode());

        buffer3.append(" hai");

        System.out.println(buffer3);
        System.out.println(buffer3.hashCode());
    }
}
