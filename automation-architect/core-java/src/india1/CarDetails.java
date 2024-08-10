package india1;

public class CarDetails {
    public static void main(String[] args) {
       
        // // Creating an object of the Car class using the constructor
        Car car1 = new Car("Red", "Toyota", 2021);

        // // Accessing object methods
        // car1.displayDetails();

        Car c2 = new Car();
        
        c2.color = "RED";
        c2.model = "2020";
        c2.year = 2000;

        c2.displayDetails();


    }
}
