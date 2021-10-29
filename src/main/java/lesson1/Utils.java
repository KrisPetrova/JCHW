package lesson1;

public abstract class Utils {
    public static void makeAnimalOlder(Cat cat) {
        cat.setAge(cat.getAge() + 1);
    }
}
