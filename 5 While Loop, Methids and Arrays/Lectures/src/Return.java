import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greeting();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println("Sum is: " + sum);
    }
    public static  void greeting() {
        System.out.println("Welcome to  calculator");
    }
    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        return number;
    }

}