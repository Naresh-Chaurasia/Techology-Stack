package india1;

public class Main {
    public static void main(String[] args) {

        String name1="Ch";
        String name2="Ch";

        

        String str = "Hello, World!";

        // Length of the string
        int length = str.length();
        System.out.println("Length: " + length);  // Output: 13

        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr);  // Output: HELLO, WORLD!

        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr);  // Output: hello, world!

        // Substring
        String subStr = str.substring(7);
        System.out.println("Substring: " + subStr);  // Output: World!

        // Replace
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced: " + replacedStr);  // Output: Hello, Java!

        // Concatenation
        String concatStr = str.concat(" How are you?");
        System.out.println("Concatenated: " + concatStr);  // Output: Hello, World! How are you?

        // Check equality
        boolean isEqual = str.equals("Hello, World!");
        System.out.println("Is Equal: " + isEqual);  // Output: true

        

    }
}


