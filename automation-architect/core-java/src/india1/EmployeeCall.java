package india1;

public class EmployeeCall {
    public static void main(String[] args) {
        EmployeeCall obj = new EmployeeCall();
        obj.method1();

        method1();

        EmployeeCall.method1();
    }   
    
    
    static void method1(){
        System.out.println("I am static method...");
    }

}
