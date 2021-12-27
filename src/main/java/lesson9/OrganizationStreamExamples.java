package lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrganizationStreamExamples {
    public static void main(String[] args) {
        List<Organization> organizations = new ArrayList<>();

        organizations.add(new Organization(1, "Yandex", Arrays.asList(
                new Worker("Oleg", 55, 100, "Engineer"),
                new Worker("Anton", 25, 120, "Manager"),
                new Worker("Elena", 35, 140, "Engineer"))));

        organizations.add(new Organization(2, "Sber", Arrays.asList(
                new Worker("Oleg", 55, 100, "Engineer"),
                new Worker("Oleg", 25, 120, "Manager"),
                new Worker("Elena", 35, 140, "Engineer"),
                new Worker("Dmitry", 35, 140, "Director"),
                new Worker("Oksana", 35, 140, "Engineer"))));

        organizations.add(new Organization(3, "Mail", Arrays.asList(
                new Worker("Oleg", 55, 100, "Engineer"),
                new Worker("Anton", 25, 120, "Manager"),
                new Worker("Semen", 65, 140, "Director"),
                new Worker("Elena", 35, 140, "Engineer"))));

        //Вернуть уникальные имена сотрудников компаний, где > 3 сотрудников

        System.out.println(organizations.stream()
                .filter(o -> o.getWorkers().size() > 3)
                .map(o -> o.getWorkers())
                .flatMap(w -> w.stream())
                .map(w -> w.getName())
                .distinct()
                .collect(Collectors.toList())
        );

        //Создать Map, где ключ - название должности, значение - список сотрудников на этой должности
        Map<String, List<Worker>> workersMap = organizations.stream()
                .map(o -> o.getWorkers())
                .flatMap(w -> w.stream())
                .collect(Collectors.groupingBy(w -> w.getPosition()));

        //Создать Map, где ключ - должность, а значение - средняя зарплата
        Map<String, Double> salaryRating = organizations.stream()
                .map(o -> o.getWorkers())
                .flatMap(w -> w.stream())
                .collect(Collectors.groupingBy(w -> w.getPosition(), Collectors.averagingDouble(f -> f.getSalary())));

        System.out.println(salaryRating);
    }
}

