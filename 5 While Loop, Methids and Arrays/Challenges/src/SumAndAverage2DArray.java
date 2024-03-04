public class SumAndAverage2DArray {
    public static void main(String[] args) {
        System.out.println("Sum And Average of 2DArray");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);
        double avg = avg(numArr);
        System.out.println("Your sum of array is: " + sum);
        System.out.println("Your avg of array is: " + avg);
    }

    public static long sum(int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr.length) {
                sum = sum + numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static long avg(int[][] numArr) {
        if (numArr.length == 0) {
            return 0;
        }
        int rows = numArr.length;
        int cols = numArr[0].length;
        long size = (long) rows * cols;
        return sum(numArr) / size;
    }
}
