package in.dilip.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
    }

    private static void b() {
        c();
    }

    private static void c() {
        d();
    }

    private static void d() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator");
        System.out.print("Enter the two number\n");
        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        try {
            int[] a = new int[5];
            System.out.printf("Result is $d", a[6]);
            a[6] = first / second;
            System.out.printf("Result is $d", a[6]);

            int result = first / second;
            System.out.printf("Result is %d", result);
//        } catch (ArithmeticException exception) {
//            System.out.printf("%s, enter valid values",
//                    exception.getMessage());
//        } catch (ArrayIndexOutOfBoundsException exc) {
//            System.out.printf("%s, enter valid values",
//                    exc.getMessage());
        } catch (Throwable th) {
            System.out.println("General Exception");
            throw th;
        } finally {
            System.out.println("I'm in finally");
        }
    }
}
