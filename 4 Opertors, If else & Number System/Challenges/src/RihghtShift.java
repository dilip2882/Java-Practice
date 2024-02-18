import java.util.Scanner;

public class RihghtShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase Right Shift operator");
        System.out.print("Enter your number: ");
        int number = input.nextInt();

        int result = number >> 1;
        System.out.println("Your Right Shift number is: " + result);
    }
}
