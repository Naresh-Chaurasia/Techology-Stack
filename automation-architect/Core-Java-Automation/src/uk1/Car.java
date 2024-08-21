package uk1;

public class Car {

    String color;
    int model;
    String company;

    //No return type.
    Car(String c){
        company = c;
    }

    void start(){
        System.out.println("Starting Car...");
    }

    void stop(){
        System.out.println("Stopping Car...");
    }

    void display(){
        System.out.println(color);
        System.out.println(model);
        System.out.println(company);
    }
    
}
