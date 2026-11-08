
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello Bisrat!");

        // Addition
        int Total = add(10, 20);
        System.out.println("Addition: " + Total);

        // Subtraction
        int difference = subtract(20, 10);
        System.out.println("Subtraction: " + difference);

        // Multiplication
        int product = multiply(10, 20);
        System.out.println("Multiplication: " + product);

        // Division
        int quotient = division(10, 2);
        System.out.println("Division: " + quotient);
    }

    // Addition method
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtraction method
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication method
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Division method
    public static int division(int a, int b) {
        return a / b;
    }
}
