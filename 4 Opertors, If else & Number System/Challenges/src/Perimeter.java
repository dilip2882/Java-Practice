import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        System.out.println("Perimeter of rectangle");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter all four sides in cms: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double Perimeter = a + b + c + d;
        System.out.println("Perimeter of your rectangle in cms : " + Perimeter);




    }
}
