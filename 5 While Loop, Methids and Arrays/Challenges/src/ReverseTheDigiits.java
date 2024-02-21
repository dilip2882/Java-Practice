import java.util.Scanner;

public class ReverseTheDigiits {
    public static void main(String[] args) {
        int num = readNumber();
        int reverse = Reverse(num);
        System.out.println("Reverse of your number is: " + reverse);

    }

    static int Reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }
    static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return input.nextInt();
    }
}
