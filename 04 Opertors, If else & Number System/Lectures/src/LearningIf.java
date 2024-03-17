
import java.util.Scanner;

public class LearningIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter name: ");
        String name = input.nextLine();

        System.out.print("Please enter \"true\" if he or \"false\" if she: ");
        boolean isName = input.nextBoolean();
        input.nextLine(); // Consume the newline character

        if (isName) {
            System.out.println("Mr. " + name);
        } else {
            System.out.println("Ms. " + name);
        }
        System.out.println("\nGender detected");

        System.out.print("\nNow, enter true if Senior Citizen or false if not: ");
        boolean isSeniorCitizen = input.nextBoolean();
        input.nextLine(); // Consume the newline character

        System.out.print("If you are an adult, enter true; otherwise, enter false: ");
        boolean isAnAdult = input.nextBoolean();
        input.nextLine(); // Consume the newline character

        if (isSeniorCitizen) {
            System.out.println("Hello Senior Citizen");
        } else {
            if (isAnAdult) {
                System.out.println("Hello Adult");
            } else {
                System.out.println("Hello Child");
            }
        }
    }
}
