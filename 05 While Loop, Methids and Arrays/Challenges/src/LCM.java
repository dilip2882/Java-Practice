import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        int first = readNumber();
        int second = readNumber();
        int lcm = lcm(first,second);
        System.out.println("Least common multiple of two number is: " + lcm);
    }
    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return input.nextInt();
    }
    public static int lcm(int first, int second) {
        int i = 1;
        while (i <= second) {
            int factor = first * i;
            if (factor % second == 0){
                return factor;
            }
            i++;
        }
        return 0; //unreachable
    }
}