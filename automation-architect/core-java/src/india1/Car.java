package india1;

public class Car {
    
  // Attributes (properties)
  String color;
  String model;
  int year;

  public Car(){
    System.out.println("Inside Car...");
  }

  // Constructor
  public Car(String color, String model, int year) {
      this.color = color;
      this.model = model;
      this.year = year;
  }

  // Method to display car details
  public void displayDetails() {
      System.out.println("Color: " + color);
      System.out.println("Model: " + model);
      System.out.println("Year: " + year);
  }
}
