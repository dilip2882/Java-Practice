import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int num = readNumber();
        int i = 1;
        while (i <= num) {
            System.out.println(i + " " + isPrime(i));
            i++;
        }
    }

    static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        int i = 2;
        while (i * i <= num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return input.nextInt();
    }
}
