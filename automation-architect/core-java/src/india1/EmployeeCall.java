package india1;

public class EmployeeCall {
    public static void main(String[] args) {
        Employee e1 = new Employee("E1");
        e1.showEmployeeDetails();        
        System.out.println(e1.company);
        //e1.company = "CTS";



        Employee e2 = new Employee("E2");
        e2.showEmployeeDetails();
        System.out.println(e2.company);
    }    
}
