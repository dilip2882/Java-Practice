package in.dilip.varargs;

public class VarArgs {
    public static void main(String... args) {
        // Print a greeting message
        System.out.println("Hello world!");

        // Calculate and print the sum of 4 and 5
        System.out.println("Sum of 4 and 5: " + sum(4, 5));

        // Calculate and print the sum of 4, 5, and 6
        System.out.println("Sum of 4, 5, and 6: " + sum(4, 5, 6));

        // Calculate and print the sum of 1, 2, 3, 4, and 5
        System.out.println("Sum of 1, 2, 3, 4, and 5: " + add(1, 2, 3, 4, 5));
    }

    // Calculate the sum of variable arguments (varargs)
    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    // Calculate the sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Calculate the sum of two integers and additional varargs
    public static int add(int first, int second, int... a) {
        int sum = first + second;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
