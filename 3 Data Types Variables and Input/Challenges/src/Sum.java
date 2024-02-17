import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Welcome to our calc");
        System.out.print("Please enter first number: ");
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        System.out.print("Please enter second number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum of your numbers is: " + sum);




    }
}
