import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase Left Shift operator");
        System.out.print("Enter your number: ");
        int number = input.nextInt();

        int result = number << 1;
        System.out.println("Your Left Shift number is: " + result);
    }
}
