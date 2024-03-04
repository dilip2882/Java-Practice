public class SumAndAverageOfTwo2DArray {
    public static void main(String[] args) {
        System.out.println("Sum And Average of 2DArray");
        int[][] numArr1 = ArrayUtility.input2DArray();
        int[][] numArr2 = ArrayUtility.input2DArray();
        long[][] sum = sum(numArr1, numArr2);

    }

    public static long[][] sum(int[][] numArr1, int[][] numArr2) {
        int sumArrSize = numArr1.length + numArr2.length;
        long[][] sumArr = new long[sumArrSize][sumArrSize];
        int i = 0;
        while (i < numArr1.length || i < numArr2.length) {
            int j = 0;
            while (j < numArr1.length || j < numArr2.length) {
                sumArr[i][j] = numArr1[i][j] + numArr2[i][j];
                j++;
            }
            i++;
        }
        return sumArr;
    }
}
