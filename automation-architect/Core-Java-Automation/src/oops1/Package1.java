package oops1;

import oops2.AccessModifiersExample;

public class Package1 {
    public static void main(String[] args) {
        AccessModifiersExample obj = new AccessModifiersExample();

        // Accessing public method and variable
        obj.publicMethod();  // Outputs: I am public

        //obj.defaultMethod();
        //obj.privateMethod();
        //obj.protectedMethod();

        // Accessing protected and default members within the same package
        //obj.protectedMethod();  // Outputs: I am protected
        //obj.defaultMethod();    // Outputs: I am default

        // Attempting to access private members (will cause a compilation error)
        // obj.privateMethod();  // Error: privateMethod() has private access
    }
}
