import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise And operator");
        System.out.print("Please, Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Now, Enter the second number: ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("Result of Bitwise AND is: " + result);

    }
}
