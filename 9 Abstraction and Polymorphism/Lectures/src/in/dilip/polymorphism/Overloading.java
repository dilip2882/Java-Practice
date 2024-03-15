package in.dilip.polymorphism;

public class Overloading {

    Overloading() {
        System.out.println("Default constructor called.");
    }

    Overloading(String pop) {
        System.out.println(pop);
    }
    public int sum(int a, int b) {
        return a + b;
    }

    public String sum(String a, String b) {
        return a + b;
    }

    public int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Overloading overload = new Overloading();
        int sum = overload.sum(3, 4);
        System.out.println(overload.sum(5, sum));

        System.out.println(overload.sum(3, 4, 2, 4));

        System.out.println(overload.sum("Dilip", " Patel"));
    }
}
