import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("2D Array");
        int[][] numsArr = ArrayUtility.input2DArray();
        System.out.print("Now enter the number you want to search: ");
        int num = input.nextInt();
        boolean isFound = search(numsArr, num);
        if (isFound) {
            System.out.println("Your number: " + num + " is found in array");
        } else {
            System.out.println("Your number: " + num + " is not found in array");
        }
    }

    public static boolean search(int[][] numsArr, int num) {
        int i = 0;
        while (i < numsArr.length) {
            int j = 0;
            while (j < numsArr.length) {
                if (numsArr[i][j] == num ) {
                    return true;
                }
                    j++;
            }
            i++;
        }
        return false;
    }
}
