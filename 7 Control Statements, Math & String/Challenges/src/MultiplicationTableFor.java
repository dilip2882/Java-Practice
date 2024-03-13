import java.util.Scanner;

public class MultiplicationTableFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Multiplication Table using For");
        System.out.print("Enter the table you want: ");
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
