package in.dilip.challenge91;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,1,8,2,1);
        System.out.println(Collections.frequency(list, 1));
        System.out.println(Collections.frequency(list, 2));
        System.out.println(Collections.frequency(list, 5));

    }
}
