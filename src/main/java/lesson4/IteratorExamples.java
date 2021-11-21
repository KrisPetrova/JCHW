package lesson4;

import java.util.*;

public class IteratorExamples {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 5));

        for(Integer i : integers) {
            if (i == 3) {
                integers.remove(i);
            }
        }

        System.out.println(integers);

        HashMap<String, Integer> integerHashMap = new HashMap<>();
        integerHashMap.put("test1", 4);
        integerHashMap.put("test2", 4);
        integerHashMap.put("test3", 4);
        integerHashMap.put("test4", 4);

        Iterator<Map.Entry<String, Integer>> iterator = integerHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            String data = iterator.next().getKey();
            if(data.equals("test2")) iterator.remove();
        }
        System.out.println(integerHashMap);
    }
}
