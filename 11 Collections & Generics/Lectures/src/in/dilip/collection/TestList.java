package in.dilip.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Dilip");
        strList.add("Patel");
//        strList.add(55);

        strList.add(1,"middleName");

        strList.remove(0);

        if (strList.contains("Patel")) {
            System.out.println(strList.indexOf(("Patel")));
        }

//        System.out.println(strList.get(0));
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        for (String str : strList) {
            System.out.println(str);
        }
    }
}
