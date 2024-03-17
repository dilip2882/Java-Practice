import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Your no is positive");
        } else if (num == 0) {
            System.out.println("Your no is zero");
        } else {
            System.out.println("Your no is negative");
        }


    }
}
