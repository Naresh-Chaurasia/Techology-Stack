package debug;

public class ConditionalDebug {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int result = multiply(i, 2);
            System.out.println("Result: " + result);
        }
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
}