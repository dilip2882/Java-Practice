import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = readNumber();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("Your number is Armstrong");
        } else {
            System.out.println("Ypur number is not Armstrong");
        }
    }

    static boolean isArmstrong(int num) {
        int noOfDigits = noOfDigoits(num);
        int numCopy = num;
        int finalNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, noOfDigits);
        }
        return finalNumber == numCopy;
    }

    static int pow(int num1, int num2) {
        int result = num1;
        int i = 0;
        while (i < num2) {
            result = result * num1;
            i++;
        }
        return  result;
    }

    static int noOfDigoits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num = num / 10;
        }
        return  digits;
    }

    static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return input.nextInt();
    }
}
