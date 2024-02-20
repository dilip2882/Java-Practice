import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Welcome to factorial calculator");
        int num = readNumber();
        int res = FactorialNum(num);
        System.out.println("The factorial of " + num + " is: " + res);
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return input.nextInt();
    }

    public static int FactorialNum(int num) {
        int mul = 1;
        while (num >= 1) {
            mul = mul * num;
            num--;
        }
        return mul;
    }
}
