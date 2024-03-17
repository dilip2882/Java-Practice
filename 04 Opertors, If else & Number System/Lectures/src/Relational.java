import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ticket discount calculator");

        System.out.print("Please, Enter your age: ");
        int age = input.nextInt();

        System.out.print("Are you a female? (true/false) ");
        boolean isFemale = input.nextBoolean();

        if (age < 5) {
            System.out.println("You Got 75% discount");
        } else if (isFemale){
            System.out.println("You Got 75% discount");
        } else if (age > 60 && !isFemale) {
            System.out.println("You Got 25% discount");
        } else {
            System.out.println("You Got no discount");
        }
    }

}
