public class ArrayPalindrome {
    public static void main(String[] args) {
        System.out.println("Check whether array is palindrome or not");
        int[] numArr = ArrayUtility.inputArray();

        boolean ispalin = isPalindrome(numArr);
        if (ispalin) {
            System.out.println("Your array is palindrome");
        } else {
            System.out.println("Youe array is not palindrome");
        }

    }

    public static boolean isPalindrome(int[] numArr) {
        int i = 0;
        while (i < numArr.length / 2) {
            if (numArr[i] != numArr[numArr.length - 1 - i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
