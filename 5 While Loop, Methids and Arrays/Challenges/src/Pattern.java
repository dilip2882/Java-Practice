import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int maxRows = input.nextInt();
        pattern4(maxRows);

    }

    static void pattern1(int maxRows) {
        for (int row = 1; row <= maxRows ; row++) {
            //for every row, run the col
            for (int col = 1; col <= maxRows; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern2(int maxRows) {
        for (int row = 1; row <= maxRows ; row++) {
            //for every row, run the col
            for (int col = 1; col <= row; col--) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern3(int maxRows) {
        for (int row = 1; row <= maxRows ; row++) {
            //for every row, run the col
            for (int col = maxRows; col >= row; col--) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

//    pattern 4:
//            1
//            12
//            123
//            1234
//            12345
    static void pattern4(int maxRows) {
        for (int row = 1; row <= maxRows ; row++) {
            //for every row, run the col
            for (int col = 1; col <= row; col++) {

                System.out.print(col);
            }
            // when one row is printed, we need to add a newline
            System.out.println();
            }
        }
}
