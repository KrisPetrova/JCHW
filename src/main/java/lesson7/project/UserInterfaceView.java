package lesson7.project;

import java.io.IOException;
import java.util.Scanner;

public class UserInterfaceView {
    private Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите название города");
            String city = scanner.nextLine();

            System.out.println("Введите 1 для получения погоды на сегодня; " +
                    "Введите 5 для получения погоды на 5 дней; " +
                    "Введите 0 для выхода.");

            String command = scanner.nextLine();

            //TODO* Сделать метод валидации пользовательского кода

            if (command.equals("0")) break;

            try {
                controller.getWeather(command, city);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
