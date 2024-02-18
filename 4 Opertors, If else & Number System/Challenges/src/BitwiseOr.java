import java.util.Scanner;

public class BitwiseOr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise OR operator");
        System.out.println("Please, Enter the first number: ");
        int first = input.nextInt();
        System.out.println("Now, Enter the second number: ");
        int second = input.nextInt();

        int result = first | second;
        System.out.println("Result of Bitwise OR is: " + result);
    }
}
