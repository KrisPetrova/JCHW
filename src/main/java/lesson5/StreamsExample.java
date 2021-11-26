package lesson5;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StreamsExample {
    public static void main(String[] args) {
        String tempString = "cat";

        System.out.println(Arrays.toString(tempString.getBytes()));

        //00000000 - 11111111 2^8 = 256, 0-256, -128-127
        // 0-0, 1-1, 127-127, 128- -128

        System.out.println((byte)208);
        System.out.println(Charset.availableCharsets());

        File file = new File("1.txt");

        try (OutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write("кот".getBytes(StandardCharsets.UTF_8));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (OutputStream outputStream1 = new FileOutputStream(file, true)) {
            outputStream1.write(65);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

       /* long time = System.currentTimeMillis();

        try (OutputStream outputStream2 = new FileOutputStream("bigFile.txt")) {

            for(int i = 0; i < 5 * 1024 * 1024; i++) {
                outputStream2.write(65);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("запись 5 мегабайт заняла: " + (System.currentTimeMillis() - time));*/

        long time = System.currentTimeMillis();

        try (OutputStream outputStream2 = new BufferedOutputStream(new FileOutputStream("bigFile.txt"))) {

            for(int i = 0; i < 5 * 1024 * 1024; i++) {
                outputStream2.write(65);
                //outputStream2.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("запись 5 мегабайт с буфером заняла: " + (System.currentTimeMillis() - time));

        try (InputStream inputStream = new FileInputStream("1.txt")) {
            for (int i = 0; i < new File("1.txt").length(); i++){
                System.out.println(i + ": " + (char)inputStream.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] bytes = null;

        try (InputStream inputStream = new FileInputStream("1.txt")) {
            bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Прочитали строку в нужной кодировке " + new String(bytes, StandardCharsets.UTF_8));


    }
}
