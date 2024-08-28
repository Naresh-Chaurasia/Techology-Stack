package oops1;

class Employee {
    String name;
    static String companyName;

    Employee(String n) {
        name = n;
    }

    void showEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Company: " + companyName);
    }
}