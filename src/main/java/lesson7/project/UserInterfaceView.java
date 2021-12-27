package lesson7.project;

import java.io.IOException;
import java.util.Scanner;

public class UserInterfaceView {
    private Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите 1 для получения погоды на сегодня; " +
                    "Введите 5 для получения погоды на 5 дней; " +
                    "Введите 2 для получения данных из базы; " + "Введите 0 для выхода.");

            String command = scanner.nextLine();

            if (command.equals("0")) break;

            else if (!(command.equals("1") || command.equals("5")||(command.equals("2")))) {
                System.out.println("Введено некорректное значение");
                continue;}

            System.out.println("Введите название города");
            String city = scanner.nextLine();

            try {
                controller.getWeather(command, city);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
