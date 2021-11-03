package lesson1.homework1;

/* 1. Разобраться с имеющимся кодом.
2. Добавить класс Team, который будет содержать:
название команды;
массив из четырех участников — в конструкторе можно сразу всех участников указывать);
метод для вывода информации о членах команды, прошедших дистанцию;
метод вывода информации обо всех членах команды.
3. Добавить класс Course (полоса препятствий), в котором будут находиться:
массив препятствий;
метод, который будет просить команду пройти всю полосу.
В итоге должно получиться похожее:
public static void main(String[] args) {
Course c = new Course(...); // Создаем полосу препятствий
Team team = new Team(...); // Создаем команду
c.doIt(team); // Просим команду пройти полосу
team.showResults(); // Показываем результаты
}*/

public class Competition {

    public static void main(String[] args) {
        Course course = new Course();
        Tiger[] competitors = {new Tiger("Tom", 1500, 6, 600), new Tiger("Tim", 800, 3, 400), new Tiger("Bob", 2000, 9, 700), new Tiger("Bill", 3000, 2, 750)};
        Team team = new Team("DreamTeam", competitors);
        Obstacle[] obstacles = {new Cross(1000), new Pool(500), new Wall(5)};

        System.out.println("Название команды: " + team.getName());

        System.out.println("Приветствие участников: ");
        team.showResults();

        System.out.println("Команда проходит полосу препятствий: ");
        course.doIt(team);

        System.out.println("Результаты команды: ");
        team.showResults();
    }
}
