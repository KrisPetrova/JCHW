package lesson5;

import java.io.File;
import java.io.IOException;

public class FileExamples {
    public static void main(String[] args) {
        /*File file = new File("1.txt");

        System.out.println(file.exists());

        try {
            file.createNewFile();
            System.out.println(file.length());

            //file.deleteOnExit();
            file.delete();

            File filePath = new File("1");
            filePath.mkdir();

            File filePath2 = new File("2/1/3/4");
            filePath2.mkdirs();

            System.out.println(filePath.length());

            for (File fileTemp : filePath2.listFiles()){
                System.out.println(fileTemp.getName());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        File file3 = new File("students.txt");
        try {
            file3.createNewFile();
            System.out.println(file3.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
