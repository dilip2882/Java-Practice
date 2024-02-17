import java.util.Scanner;

public class TraingleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Area of Triangle");
        System.out.print("please enter your base in cms: ");
        double base = input.nextDouble();

        System.out.print("please enter your height in cms: ");
        double height = input.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area of Triangle is: " + area);


    }
}
