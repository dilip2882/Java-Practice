public class Array {
    public static void main(String[] args) {
//        int[] myArray = new int[5];
//        myArray[0] = 88;
//        myArray[1]= 50;
//        myArray[2] = 44;
//        myArray[3] = 33;
//        myArray[4] = 33;
        int[] myArray = {88, 50, 44, 88, 0, 99, 98};
//        int index = 2;
//
//        System.out.println(myArray[0]);
//        System.out.println(myArray[1]);
//        System.out.println(myArray[2]);
//        System.out.println(index);
//        System.out.println(myArray[index]);
//        System.out.println(myArray[3]);
//        System.out.println(myArray[4]);
//        System.out.println(myArray[5]);
        arrayTraversing(myArray);


        String[] strArr = new String[4];
        strArr[0] = "My String";

        String[] myNewStrArr = {"first", "second", "third"};
        stringArray(myNewStrArr);

    }
    static void arrayTraversing(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            System.out.println(arr[index]);
            index++;
        }
    }

    static  void stringArray(String[] arr) {
        System.out.println("String Array");
        System.out.println(arr.length);

        int index = 0;
        while (index < arr.length) {
            System.out.println(arr[index]);
            index++;
        }

    }
}
