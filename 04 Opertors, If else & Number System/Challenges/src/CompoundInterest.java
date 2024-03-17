import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Simple Interest ");
        System.out.print("please enter your principal amount in Rs: ");
        int principal = input.nextInt();

        System.out.print("please enter your rate of interest in %: ");
        double rate = input.nextDouble();

        System.out.print("please enter years: ");
        double years = input.nextDouble();

        double compInt = principal * Math.pow((1 + rate / 100), years);

        System.out.println("\n\nSimple Interest is: " + compInt);


    }
}