import java.util.Scanner;

public class Circle {
    double radiusINMm;

    Circle(double radiusINMm) {
        this.radiusINMm = radiusINMm;
    }

    double getCircumference() {
        return 2 * radiusINMm * Math.PI;
    }

    double getArea() {
        return Math.PI * Math.pow(radiusINMm, 2);
    }

    @Override
    public String toString() {
        return "Circle Props: Radius in mm: " + radiusINMm
                + " , Circumference in mm: " + getCircumference()
                + " , Area in mm2:  " + getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of circle");
        System.out.print("Enter your address: ");
        double radius = input.nextInt();
        Circle circle = new Circle(radius);
        System.out.println(circle);
    }
}
