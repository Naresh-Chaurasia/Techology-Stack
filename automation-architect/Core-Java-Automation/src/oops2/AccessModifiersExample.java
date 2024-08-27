package oops2;

public class AccessModifiersExample {

    // Public variable: Accessible from anywhere
    public String publicVar = "I am public";

    // Private variable: Accessible only within this class
    private String privateVar = "I am private";

    // Protected variable: Accessible within the same package and subclasses
    protected String protectedVar = "I am protected";

    // Default (no modifier) variable: Accessible only within the same package
    String defaultVar = "I am default";

    // Public method: Accessible from anywhere
    public void publicMethod() {
        System.out.println(publicVar);
    }

    // Private method: Accessible only within this class
    private void privateMethod() {
        System.out.println(privateVar);
    }

    // Protected method: Accessible within the same package and subclasses
    protected void protectedMethod() {
        System.out.println(protectedVar);
    }

    // Default (no modifier) method: Accessible only within the same package
    void defaultMethod() {
        System.out.println(defaultVar);
        System.out.println(privateVar);
    }
}