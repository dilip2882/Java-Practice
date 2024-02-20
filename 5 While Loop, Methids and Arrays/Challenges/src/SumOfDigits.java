import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        int num = readNumber();
        int res = SOD(num);
        System.out.println("Sum of Digits is: " + res);

    }
    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return input.nextInt();
    }
    public static int SOD (int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum  + (num % 10);
            num = num/10;
        }
        return sum;
    }
}
