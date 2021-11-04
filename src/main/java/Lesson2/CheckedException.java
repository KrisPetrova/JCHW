package Lesson2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CheckedException {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("2.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Я жив!");
    }


}
