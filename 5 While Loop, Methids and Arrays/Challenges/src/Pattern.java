import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int maxRows = input.nextInt();
        pattern6(maxRows);

    }

//    pattern1:
//            * * * * *
//            * * * * *
//            * * * * *
//            * * * * *
//            * * * * *

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

//pattern2:
//            *
//            * *
//            * * *
//            * * * *
//            * * * * *
    static void pattern2(int maxRows) {
        for (int row = 1; row <= maxRows ; row++) {
            //for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

//    pattern3:
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *
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

//    pattern4:
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

//        pattern5:
//            *
//            * *
//            * * *
//            * * * *
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *
    static void pattern5A(int maxRows) {
        for (int row = 1; row <= maxRows ; row++) {
            //for every row, run the col
            for (int col = 1; col <= row; col++) {

                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }

        for (int row = 1; row <= maxRows ; row++) {
            //for every row, run the col
             for (int col = maxRows - 1; col >= row; col--) {

                 System.out.print("* ");
             }
             // when one row is printed, we need to add a newline
             System.out.println();
        }
    }

        static void pattern5B(int maxRows) {
            for (int row = 1; row < 2 * maxRows; row++) {

                // Logic
                //explanation:
                //if (row > maxRows) {
                //    maxRows - (row - maxRows) = 2 * maxRows - row
                //}
                int totalColsInRow = row > maxRows ? 2 * maxRows - row : row;

                // Print the stars
                for (int col = 1; col <= totalColsInRow; col++) {
                    System.out.print("* ");
                }

                // Add a newline after each row
                System.out.println();
            }
        }

//        pattern6:
    static void pattern6(int maxRows) {
        for (int row = 1; row < 2 * maxRows; row++) {

            // Logic
            //explanation:
            //if (row > maxRows) {
            //    maxRows - (row - maxRows) = 2 * maxRows - row
            //}
            int totalColsInRow = row > maxRows ? 2 * maxRows - row : row;

            //Logic for Spaces
            int noOfSpaces = maxRows - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            // Print the stars
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }

            // Add a newline after each row
            System.out.println();
        }
    }

}
