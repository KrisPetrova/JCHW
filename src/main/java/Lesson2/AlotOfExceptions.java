package Lesson2;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class AlotOfExceptions {

    public static void main(String[] args) {

        InputStream inputStream = null;

        try {
            test1();
            //int i = 1/0;

            inputStream = new FileInputStream("2.txt");

            String[] strings = {"asfa", "afas"};
            //String str = strings[2];

        } catch (ArithmeticException e) {

        } catch (FileNotFoundException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
         } finally {
            System.out.println("Я всё равно выполнился!");
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Я жив!");
    }

    public static void test1(){

    }

}
