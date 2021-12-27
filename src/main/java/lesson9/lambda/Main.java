package lesson9.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Fish", false, false));
        animalList.add(new Animal("Cat", true, true));
        animalList.add(new Animal("Frog", false, true));
        animalList.add(new Animal("Turtle", true, false));

        //printAnimal(animalList, new CheckIsJumper());

        printAnimal(animalList, new CheckAble() {
            @Override
            public boolean test(Animal animal) {
                return animal.isCanRun();
            }
        });
    }

    private static void printAnimal(List<Animal> animalList, CheckAble checkAble) {
        for (Animal animal : animalList) {
            if (checkAble.test(animal)){
                System.out.println(animal);
            }
        }
    }
}
