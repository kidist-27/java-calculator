
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

        // Addition
        int sum = add(10, 20);
        System.out.println("Addition: " + sum);

        // Subtraction
        int difference = subtract(20, 10);
        System.out.println("Subtraction: " + difference);
    }

    // Addition method
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtraction method
    public static int subtract(int a, int b) {
        return a - b;
    
    }
}
