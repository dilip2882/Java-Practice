import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Multiplication Table you want to print:  ");
        int i = input.nextInt();

            int j = 1;
            while (j <= 10){
                System.out.println(i + " * " + j + " = " + i * j);
                j++;
            }
    }
}
