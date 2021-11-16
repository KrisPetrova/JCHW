package lesson3.homework3;

/*      1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        2. Задача:
        Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        Для хранения фруктов внутри коробки можно использовать ArrayList;
        Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
        Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
        Не забываем про метод добавления фрукта в коробку.*/

public class Main {
    public static void main(String[] args) {
        Apple apl = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxApple = new Box<Apple>();
        Box<Orange> boxOrange = new Box<Orange>();
        boxApple.addFruit(apl);
        boxApple.addFruit(apl);
        boxApple.addFruit(apl);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);

        boxApple.compare(boxOrange);
    }

    public static void changeElements(Object[] array, int a, int b) {
        Object tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

}
