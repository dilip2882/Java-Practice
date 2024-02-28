import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {4,55,5, 4, 3, 44, 76, 99};
        System.out.println("Array Searching\n");
        System.out.print("Enter thr number you want to search: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("Your number was found in Array");
        } else {
            System.out.println("Your number was not found in Array");
        }
    }

    static boolean isFound(int arr[], int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}
