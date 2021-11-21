package lesson4;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExamples {

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(100);
        integerArrayList.add(123);
        integerArrayList.add(456);
        integerArrayList.add(789);
        integerArrayList.add(123);

        System.out.println(integerArrayList);

        integerArrayList.remove(Integer.valueOf(123));
        integerArrayList.remove(Integer.valueOf(123));
        System.out.println(integerArrayList);

        System.out.println(integerArrayList.size());

        integerArrayList.set(0, 999);
        System.out.println(integerArrayList);

        integerArrayList.add(1, 888);
        System.out.println(integerArrayList);

        System.out.println(integerArrayList.get(0));

        System.out.println(integerArrayList.contains(888));

        ArrayList<Integer> integerArrayList1 = new ArrayList<>(Arrays.asList(456, 999));
        integerArrayList.removeAll(integerArrayList1);
        System.out.println(integerArrayList);

        integerArrayList.addAll(integerArrayList1);
        System.out.println(integerArrayList);

    }
}
