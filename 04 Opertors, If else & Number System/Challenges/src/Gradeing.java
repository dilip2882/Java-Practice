import java.util.Scanner;

public class Gradeing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculate grades based on marks");

        System.out.print("Enter total marks of exam: ");
        int TotalMarks = input.nextInt();

        System.out.print("Enter your marks: ");
        int ScoredMarks = input.nextInt();

        double percentage = (ScoredMarks / (double) TotalMarks) * 100;

        System.out.println("\nYour percentage: " + percentage + "%");

    }
}
