package uk1;

public class CallPerson {
    public static void main(String[] args) {
        int a=10;

        Car c = new Car();

        Car d = new Car();

        c.color = "red";
        c.model = 2024;

        d.color = "black";
        d.model = 2022;


        c.driveCar();
        System.out.println("-----");
        d.driveCar();
    }
}
