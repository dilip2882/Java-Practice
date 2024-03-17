import java.util.Scanner;

class oddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Odd or Even Checker");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        String result =  num % 2 == 0 ? "Even" : "Odd";
        System.out.println("Your number is: " + result);
    }
}
