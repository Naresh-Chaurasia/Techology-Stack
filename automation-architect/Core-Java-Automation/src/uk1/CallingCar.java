package uk1;

public class CallingCar {
    public static void main(String[] args) {
        Car c = new Car();
        c.color = "red";
        c.model = 2024;

        // System.out.println(c.color);
        // System.out.println(c.model);

        // c.start();
        // c.stop();
        c.display();


    }
}
