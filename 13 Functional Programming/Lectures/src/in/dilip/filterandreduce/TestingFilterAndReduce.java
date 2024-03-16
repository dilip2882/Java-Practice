package in.dilip.filterandreduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilterAndReduce {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "mango", "cherry", "date");
        System.out.println(fruits.size());

        System.out.println("Printing fruits normally");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Printing fruits using strams");
//        fruits.stream().forEach(fruit -> System.out.println(fruit));
        fruits.stream()
                .filter(fruit -> fruit.endsWith("a"))
                .forEach(fruit -> System.out.println(fruit));

//        fruits.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String fruit) {
//                System.out.println(fruit);
//            }
//        });

    }
}
