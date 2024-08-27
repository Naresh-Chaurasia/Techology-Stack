package oops1;

import oops2.Package2;

public class Package1 {
    public static void main(String[] args) {
        System.out.println("welcome to package...");

        Package2 p2 = new Package2();
        p2.display();
    }
}
