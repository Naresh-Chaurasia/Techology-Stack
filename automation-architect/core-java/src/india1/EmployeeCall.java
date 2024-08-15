package india1;

public class EmployeeCall {

    String name = "NC";
    static String company="CTS";

    public static void main(String[] args) {
       method1();
    }   
    
    void method2(){
        System.out.println(name);
        System.out.println(company);
    }
    
    static void method1(){
        System.out.println("I am static method...");
        System.out.println(company);
        //System.out.println(name);
    }

}
