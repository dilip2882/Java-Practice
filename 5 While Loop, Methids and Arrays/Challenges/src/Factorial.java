import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Welcome to factorial calculator");
        int num = readNumber();
        long res = FactorialNum(num);
        System.out.println("The factorial of " + num + " is: " + res);
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return input.nextInt();
    }

    public static long FactorialNum(int num) {
        if (num < 2) {
            return 1;
        }
        int fact = 1;
        while (num >= 1) {
            fact = fact * num;
            num--;
        }
        return fact;
    }
}
