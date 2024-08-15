package india1;

public class Employee {
    String name;
    //Class Variable.
    static String company = "TCS";

    Employee(String name) {
        this.name = name;
    }

    void showEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Company: " + company);
    }
}
