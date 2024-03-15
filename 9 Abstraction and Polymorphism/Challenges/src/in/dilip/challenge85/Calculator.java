package in.dilip.challenge85;

public class Calculator {

    int add(int a, int b) {  //Default method
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 6));
        System.out.println(calc.add(5, 6, 7));
        System.out.println(calc.add(5.5, 6, 7, 8));
    }
}
