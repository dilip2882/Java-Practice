public class TypeConversion {
    public static void main(String[] args) {
        float myFloat = 5;
        System.out.println(myFloat);  //implicit coercion

        int myInt = (int) 5.45f;
        System.out.println(myInt); //explicit casting
    }
}
