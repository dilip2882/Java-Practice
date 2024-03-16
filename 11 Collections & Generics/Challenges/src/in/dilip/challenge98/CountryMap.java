package in.dilip.challenge98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {

        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("Bharat", "New Delhi");
        countryMap.put("Nepal", "Kathmandu");
        countryMap.put("Pakistan", "Islamabad");
        countryMap.put("China", "Beijing");
        countryMap.put("Sri lanka", "Colombo");

        Scanner inpuut = new Scanner(System.in);
        System.out.print("Please enter the country name: ");
        String contry = inpuut.next();

        if (countryMap.containsKey(contry)) {
            System.out.printf("Capital of %s : %s", contry, countryMap.get(contry));

        } else {
            System.out.println("We don't know capital");
        }

    }

}
