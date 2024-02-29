import java.util.Scanner;

public class ArrayOccurrences {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Occurances\n");
        Scanner input  = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Enter the number you want to find: ");
        int num = input.nextInt();
        int occurances = noOfOccurrences(numArr,num);
        System.out.println(num + " was found " + occurances + " times in the array");
    }

    public static int noOfOccurrences(int[] numArr, int num) {
        int occ = 0;
        int i = 0;
        while (i < numArr.length) {
            if (numArr[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
