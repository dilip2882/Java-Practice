import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to calc");
        System.out.print("Please enter your first number: ");
        int a = input.nextInt();
        System.out.print("Please enter your first number: ");
        int b = input.nextInt();

        int add = a + b;
        int sub = a - b;

        System.out.println("a + b: " + add);
        System.out.println("a - b: " + sub);
        System.out.println("a * b: " + a * b);
        System.out.println("a / b: " + a / b);
        System.out.println("a % b: " + a % b);

    }
}
