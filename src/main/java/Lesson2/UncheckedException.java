package Lesson2;

public class UncheckedException {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            int c = a / b;
        }
        catch(Exception ex) {
            System.out.println("Исключение");
        }

        if(b != 0) {
            int c = a / b;
        }

        String[] strings = {"asfa", "afas"};

        System.out.println(strings[2]);

    }

}
