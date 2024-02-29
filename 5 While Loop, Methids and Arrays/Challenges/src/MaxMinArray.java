public class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("Max and Min of Array");
        int[] numArr = ArrayUtility.inputArray();
        int max = max(numArr);
        int min = min(numArr);;
        System.out.println("Maximum of the Array is " + max + " and Minimum of the Array is " + min);
    }

    public static int max(int[] numArr) {
        int max = 0;
        int i = 0;
        while (i < numArr.length) {
            if (numArr[i] > max) {
                max = numArr[i];
            }
            i++;
        }
        return max;
    }

    public static int min(int[] numArr) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numArr.length) {
            if (min > numArr[i]) {
                min = numArr[i];
            }
            i++;
        }
        return min;
    }
}
