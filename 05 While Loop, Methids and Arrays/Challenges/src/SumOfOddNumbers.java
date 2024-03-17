import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.println();
        int sum = oddSum(num);
        System.out.println("Odd Sum till " + num + " is: " + sum);
    }
    public static int oddSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            if(i % 2 != 0) {
                sum = sum + i;
            }
            i++;
        }
        return sum;
    }
}
