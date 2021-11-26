package lesson5;

import java.io.*;

public class SerializationExamples {
    public static void main(String[] args) {
        File file = new File("student");

        Student student = new Student("Anton", "Ivanov", 15);
        Student student2 = new Student("Anton2", "Ivanov2", 12);


        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(student);
            objectOutputStream.writeObject(student2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student"));
            Student studentFromFile1 = (Student) objectInputStream.readObject();
            System.out.println(studentFromFile1);

            Student studentFromFile2 = (Student) objectInputStream.readObject();
            System.out.println(studentFromFile2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
