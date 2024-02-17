import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Temp Fahrenheit to Celsius");
        System.out.print("please enter your Temp in F: ");
        float fah = input.nextFloat();


        float cel = (fah - 32) * 5.0f / 9.0f;

        System.out.print("your temp is: " + cel + "C");

    }
}
