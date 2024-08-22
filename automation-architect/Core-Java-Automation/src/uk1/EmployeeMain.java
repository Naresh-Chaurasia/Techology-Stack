package uk1;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee();
        //emp.name="abc";
        emp.setName("John");
        System.out.println(emp.getName());
    }
}
