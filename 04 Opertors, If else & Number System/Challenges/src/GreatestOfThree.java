import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        System.out.println("Greatest number of all three");
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int FirstNum = input.nextInt();

        System.out.print("Enter second number: ");
        int SecondNum = input.nextInt();

        System.out.print("Enter third number: ");
        int ThirdNum = input.nextInt();

        if (FirstNum >= SecondNum && FirstNum >= ThirdNum) {
            System.out.println("First Number," + FirstNum + " is the greatest of all three Numbers.");
        } else if (SecondNum >= ThirdNum) {
            System.out.println("Second Number," + SecondNum + " is the greatest of all three Numbers.");
        } else {
            System.out.println("Third Number," + ThirdNum + " is the greatest of all three Numbers.");
        }


    }
}
