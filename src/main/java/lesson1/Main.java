package lesson1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "белый", 1);
        System.out.println(cat1);

        Cat cat2 = new Cat("Барсик", "черный", 2);
        System.out.println(cat2);

        Cat cat3 = new Cat("Барсик", "белый", 1);
        System.out.println(cat1.equals(cat3));

        Cat cat4 = new Cat("Барсик", "белый", -1);
        cat4.setAge(-1);
        System.out.println(cat4);

        Wolf wolf = new Wolf("Trevor", "grey", 3);

        Animal animal = new Cat("Moris", "red", 2);

        if (animal instanceof Wolf){
            Wolf wolf2 = (Wolf) animal;
        } else {
            System.out.println("Не является волком!");
        }


        Cat catCompetitor1 = new Cat("Морис","red", 10);
        catCompetitor1.setSwimmingSpeed(10);
        Wolf wolfCompetitor1 = new Wolf("Волк","серый", 12);
        wolfCompetitor1.setSwimmingSpeed(12);
        Turtle turtleCompetitor1 = new Turtle("Черепаха","зеленая", 100);
        turtleCompetitor1.setSwimmingSpeed(15);

        Pool[] pools = {new Pool(15), new Pool(20), new Pool(30)};

        for (Pool pool : pools) {
            pool.getTimeToOvercome(catCompetitor1);
            pool.getTimeToOvercome(wolfCompetitor1);
            pool.getTimeToOvercome(turtleCompetitor1);

        }

    }
}
