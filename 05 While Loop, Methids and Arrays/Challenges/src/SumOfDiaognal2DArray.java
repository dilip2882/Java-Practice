public class SumOfDiaognal2DArray {
    public static void main(String[] args) {
        System.out.println("Sum of Diagonals of NxN 2D Array");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sumOfLeftDiagonal(numArr) + sumOfRightDiagonal(numArr);

            if (numArr.length % 2 != 0) {
                int index = numArr.length / 2;
                sum -= numArr[index][index];
            }
            System.out.println("Sum of Diagonals of 2D Array is " + sum);
        }


    public static long sumOfLeftDiagonal(int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            sum += numArr[i][i];
            i++;
        }
        return sum;
    }

    public static long sumOfRightDiagonal(int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int col = numArr.length - 1 - i;
            sum += numArr[i][col];
            i++;
        }
        return sum;
    }

//    public static long sum(int[][] numArr) {
//        long sum = 0;
//        int i = 0;
//        while (i < numArr.length) {
//            int j = 0;
//            while (j < numArr.length) {
//                // Check for main diagonal element.
//                if (i == j) {
//                    sum += numArr[i][j];
//                }
//                // Check for secondary diagonal element.
//                if (i + j == numArr.length - 1) {
//                    sum += numArr[i][j];
//                }
//                j++;
//            }
//            i++;
//        }
//        return sum;
//    }
}
