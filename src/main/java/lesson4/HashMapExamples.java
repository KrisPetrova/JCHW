package lesson4;

import java.util.HashMap;

public class HashMapExamples {
    public static void main(String[] args) {
        HashMap<Integer, String> passports = new HashMap<>();

        passports.put(1234, "Ira");
        passports.put(2345, "Iren");
        passports.put(1123, "Ant");
        passports.put(213432 , "Oks");

        System.out.println(passports);

        passports.remove(2345);

        System.out.println(passports.get(1123));

        passports.keySet().contains(1234);

        System.out.println(passports.values());
    }
}
