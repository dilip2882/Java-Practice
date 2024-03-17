import java.util.Scanner;

public class LoopPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int maxRows = input.nextInt();
//        RightHalfPyramid(maxRows);
//        ReverseRightHalfPyramid(maxRows);
//        LeftTriangleStar(maxRows);
        diamondPattern(maxRows);


    }
    static void RightHalfPyramid(int maxRows) {
        System.out.println("\nHere is the Reverse Half Pyramid: ");
        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print("*");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    static  void ReverseRightHalfPyramid(int maxRows) {
        System.out.println("\nHere is the Reverse Right Half Pyramid: ");
        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");
            int i = maxRows - 1;
            while (i > rows) {
                System.out.print('*');
                i--;
            }
            System.out.println();
            rows++;
        }
    }

    static void RightTriangleStar(int maxRows) {
        System.out.println("\nHere is the Right Triangle Star: ");
        for(int i=0; i<maxRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static  void LeftTriangleStar(int maxRows) {
        System.out.println("\nHere is the Left Triangle Star: ");
        for (int i = 0; i < maxRows; i++) {
            for (int j = 2*(maxRows-i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


        public static void diamondPattern(int maxRows) {
            for (int i = 0; i < maxRows; i++) {
                // Print leading spaces
                for (int j = 0; j < maxRows - i - 1; j++) {
                    System.out.print(" ");
                }

                // Print asterisks
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }

                // Print trailing newline
                System.out.println();
            }

            for (int i = maxRows - 2; i >= 0; i--) {
                // Print leading spaces
                for (int j = 0; j < maxRows - i - 1; j++) {
                    System.out.print(" ");
                }

                // Print asterisks
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }

                // Print trailing newline
                System.out.println();


            }

    }

}








