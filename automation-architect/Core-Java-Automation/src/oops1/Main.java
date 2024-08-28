package oops1;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Punit");
        e1.companyName = "CTS";
        
        Employee e2 = new Employee("NC");
        System.out.println(e2.companyName);

        e2.companyName = "TCS";
        System.out.println(e1.companyName);
    
    }
}
