import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please the Enter the no of elements: ");
        int size = input.nextInt();

        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter element no: " + (i+1) + ":");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
}
