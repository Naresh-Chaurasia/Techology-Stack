package uk1;

public class UsingVehicle {

    public static void main(String[] args) {
    
        Vehicle v = new Vehicle();
        v.start();
    
        BMWCar b = new BMWCar();
        b.honk();
        b.start();
    
    }
    
}
