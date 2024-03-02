import java.util.Scanner;

public class ArrayDelete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Enter the number you want to delete: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new array:");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occ = ArrayOccurrences.noOfOccurrences(numArr, numToDelete);
        if (occ == 0) {
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int j = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
        }
        return newArr;
    }
}
