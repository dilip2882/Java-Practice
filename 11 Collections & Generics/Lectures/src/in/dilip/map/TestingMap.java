package in.dilip.map;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Dilip", 90);
        map.put("Sachin", 10);
        map.put("Sohan", 62);
        map.put("Ram", 66);
        map.put("Mohan", 56);

        System.out.println(map.size());
        System.out.println(map.get("Dilip"));
        System.out.println(map.containsKey("Ram"));
        System.out.println(map.containsKey("Sita"));

        System.out.println(map.remove("Mohan"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf(" %s : %s" , key, map.get(key));
        }
    }
}
