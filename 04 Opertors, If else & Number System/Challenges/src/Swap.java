import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Swapping of two variable");
        System.out.print("Enter Value of a: ");
        int a = input.nextInt();
        System.out.print("Enter value of b: ");
        int b = input.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapping done");
        System.out.println("Value of a: " + a);
        System.out.println("Value of a: " + b);


    }
}
