package oops2;

public class Package2 {
    public static void main(String[] args) {
        AccessModifiersExample access = new AccessModifiersExample();
        System.out.println(access.protectedVar);
        System.out.println(access.defaultVar);

        //System.out.println(access.privateVar);
        access.defaultMethod();
    }
}
