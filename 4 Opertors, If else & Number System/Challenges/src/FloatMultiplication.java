import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Float Multiplication");

        System.out.print("Enter float value of a: ");
        float a = input.nextFloat();
        System.out.print("Enter float value of b: ");
        float b = input.nextFloat();

        System.out.println("\na * b: " + a * b);
        System.out.println("\na + b: " + (a + b));


    }
}
