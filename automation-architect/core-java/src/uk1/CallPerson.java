package uk1;

public class CallPerson {
    public static void main(String[] args) {
        int a=10;

        Car c = new Car();

        c.color = "red";
        c.model = 2024;

        System.out.println(c.color);
        System.out.println(c.model);

        c.driveCar();
    }
}
