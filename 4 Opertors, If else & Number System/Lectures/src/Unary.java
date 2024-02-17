
public class Unary {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        System.out.println("y is: "  + y);
        int z = -y;
        System.out.println("z is: " + z);

        int a = 5;
        a = a +1;
        System.out.println(a);
        a += 1;
        System.out.println(a);
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

        System.out.println("Ater Increament");
        int p = 5;
        System.out.println(p++);
        System.out.println(p);
        System.out.println(p--);
        System.out.println(p);

        System.out.println("Before Increament");
        System.out.println(++p);
        System.out.println(p);
        System.out.println(--p);
        System.out.println(p);




    }
}
