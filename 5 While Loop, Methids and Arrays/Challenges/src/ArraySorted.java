public class ArraySorted {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorted checker!");
        int[] numArr = ArrayUtility.inputArray();
        boolean isIncreasing = isIncreasing(numArr);
        boolean isDecreasing = isDecreasing(numArr);
        String traverse = travers(numArr);
        if (isIncreasing || isDecreasing) {
            System.out.println("Your array is " + travers(numArr) + " which is sorted");
        } else {
            System.out.println("Your array is not " + travers(numArr) + " sorted");
        }
    }

    public static  boolean isIncreasing(int[] numArr) {
        boolean check = true;
        int i = 0;
        while (i < numArr.length - 1) {
            if (numArr[i] < numArr[i+1]) {
                check = true;
            } else {
                check = false;
            }
            i++;
        }
        return check;
    }

    public static  boolean isDecreasing(int[] numArr) {
        boolean check = true;
        int i = 0;
        while (i < numArr.length - 1) {
            if (numArr[i] > numArr[i+1]) {
                check = true;
            } else {
                check = false;
            }
            i++;
        }
        return check;
    }

    public static String travers(int[] numArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < numArr.length; i++) {
            sb.append(numArr[i]);
            if (i < numArr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
