import java.util.Scanner;

public class Parameter {
    public static void main(String[] args) {
        int num = sumTwoNumbers(readNumber(),readNumber());
        System.out.println(num);

    }
    public static int sumTwoNumbers(int first, int second) {
        return first + second;
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        return input.nextInt();
    }
}
