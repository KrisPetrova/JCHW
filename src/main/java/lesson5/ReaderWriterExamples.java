package lesson5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ReaderWriterExamples {
    public static void main(String[] args) {
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("1.txt"), StandardCharsets.UTF_8)) {
            int x;
            while ((x=inputStreamReader.read()) !=-1) {
                System.out.println(x);
                System.out.println((char) x);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("1.txt"))) {
            System.out.println(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Student> students = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("students.txt"))) {
            String tempString;
            while ((tempString = bufferedReader.readLine()) !=null) {
                String[] studentsParamsArray = tempString.split(" ");
                students.add(new Student(studentsParamsArray[0], studentsParamsArray[1], Integer.parseInt(studentsParamsArray[2])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
    }
        System.out.println(students);

        try {
            PrintWriter printWriter = new PrintWriter("nem_students.csv");
            for (Student student : students){
                printWriter.println(student.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
