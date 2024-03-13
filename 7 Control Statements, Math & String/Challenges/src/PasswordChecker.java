import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to set your password");
        String password;
        do {
            System.out.print("Please, enter tour password: ");
            password = input.next();
        } while (!isValidPasssword(password));
        System.out.println("Thanks for entering a valid password");
    }
    public static boolean isValidPasssword(String password) {
        return password.length() > 6;
    }
}
