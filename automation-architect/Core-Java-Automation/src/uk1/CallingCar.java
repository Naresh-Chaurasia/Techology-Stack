package uk1;

public class CallingCar {
    public static void main(String[] args) {

        Car c = new Car("Hyundai");
        
        c.color = "red";
        c.model = 2024;

        Car c2 = new Car("Hyundai");
        
        c2.color = "blue";
        c2.model = 2023;


        
        // System.out.println(c.color);
        // System.out.println(c.model);

        // c.start();
        // c.stop();
        c.display();
        c2.display();


    }
}
