package india1;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);  // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        } finally {
            System.out.println("This block always executes.");
        }
    }

    public static int divide(int a, int b) {
            return a / b;
    }
}