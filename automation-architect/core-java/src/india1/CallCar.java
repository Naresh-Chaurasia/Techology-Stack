package india1;

public class CallCar {
    public static void main(String[] args) {
       
        // // Creating an object of the Car class using the constructor
        Car c1 = new Car("Red", "Toyota", 2021);

        Car c2 = new Car("Red", "Toyota", 2021);

        System.out.println("----c1----");
        c1.color = "black";
        c1.displayDetails();

        System.out.println("----c2----");
        c2.displayDetails();

        

    }
}
