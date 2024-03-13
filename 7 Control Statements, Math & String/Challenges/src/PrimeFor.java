import java.util.Scanner;

public class PrimeFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Prime number checker");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.println("Your number is" + (isPrime(num) ?  " Prime" : " Not Prime"));
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
