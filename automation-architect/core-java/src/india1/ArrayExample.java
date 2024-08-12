package india1;

public class ArrayExample {
    public static void main(String[] args) {
    
        int numbers [] = {10,20,30,40,50};

        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";

        // Accessing array elements
        System.out.println("First number: " + numbers[0]);  // Output: 1
        System.out.println("First fruit: " + fruits[0]);    // Output: Apple

        String f = fruits[0];
    
         // Length of an array
         System.out.println("Length of numbers array: " + numbers.length);  // Output: 5
         System.out.println("Length of fruits array: " + fruits.length);    // Output: 3


         System.out.print("Numbers: ");
         for (int i = 0; i < numbers.length; i++) {
             System.out.print(numbers[i] + " ");
         }

    }
}
