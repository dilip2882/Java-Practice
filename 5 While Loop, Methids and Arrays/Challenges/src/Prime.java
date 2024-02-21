import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n = readNumber();
        int i = 1;
        while (i <= n) {
            System.out.println(i + " " + isPrime(n));
            i++;
        }
    }

    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        int x = 2;
        while (x * x <= n) {
            if (n % x == 0) {
                return false;
            }
            x++;
        }
        return true;
    }

    static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return input.nextInt();
    }
}
