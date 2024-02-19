public class Pattern {
    public static void main(String[] args) {
        LeftHalfPyramid();
    }

    public static void LeftPyramid() {
        int rows = 0;
        while (rows <  20) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;

        }

    }

    public static void LeftHalfPyramid() {

        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }

    public static void RightHalfPyramid() {
        System.out.println("* * * * *");
        System.out.println("  * * * *");
        System.out.println("    * * *");
        System.out.println("      * *");
        System.out.println("        *");
    }
}

