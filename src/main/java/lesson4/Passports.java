package lesson4;

import java.util.Arrays;
import java.util.Random;

public class Passports {
    public static void main(String[] args) {
        Integer[] passports = new Integer[50];
        Random random = new Random();

        for (int i = 0; i < passports.length; i++) {
            passports[i] = random.nextInt(999999) + 100000;
        }
        System.out.println(Arrays.toString(passports));

        Integer[] newPassports = new Integer[51];
        System.arraycopy(passports, 0, newPassports, 0, passports.length);

        newPassports[50] = 123456;
        passports = newPassports;
        newPassports = null;

        System.out.println(Arrays.toString(passports));
    }
}
