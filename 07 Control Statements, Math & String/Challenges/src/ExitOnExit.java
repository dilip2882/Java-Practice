
import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter exit to break the loop");
        while (true) {
            System.out.print("Enter your command: ");
            String command = input.next();
            if (command.equalsIgnoreCase("exit")) {
                break;
            }
        }
        System.out.println("You have successfully existed.");
    }
}
