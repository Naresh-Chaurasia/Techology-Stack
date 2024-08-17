public class AccessModifiersExample {
    // Public variable: Accessible from anywhere
    public String publicVar = "I am public";

    // Private variable: Accessible only within this class
    private String privateVar = "I am private";

    // Protected variable: Accessible within the same package and subclasses
    protected String protectedVar = "I am protected";

    public void accessingPrivate(){
        System.out.println("privateVar="+ privateVar);
    }
}
