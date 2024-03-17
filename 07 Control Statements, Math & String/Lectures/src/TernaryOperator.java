import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number Checker");
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your first number: ");
        int num2 = input.nextInt();

//        int greatestNumber;
//        if (num1 > num2) {
//            greatestNumber = num1;
//        } else {
//            greatestNumber = num2;
//        }
        int greatestNumber = num1 > num2 ? num1 : num2;
        System.out.println(greatestNumber + " is the greatest number");
    }
}