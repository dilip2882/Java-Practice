import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int num = readNumber();
        int fibonacci = 30;
        System.out.println("Fibonacci series: ");
        fibonacciNumber(num);

    }

    static void fibonacciNumber(int num) {
        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }

    static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number upto which series has to be print: ");
        return input.nextInt();
    }
}
