package lesson4;

import java.util.*;

public class Cat implements Comparable<Cat> {
    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && weight == cat.weight && Objects.equals(name, cat.name);
    }

   // @Override
    //public int hashCode() {
       // return Objects.hash(name, age);
  //  }

    public static void main(String[] args) {
        Cat cat1 = new Cat("test", 1, 2);
        Cat cat2 = new Cat("test", 2, 4);
        Cat cat3 = new Cat("test2", 1, 5);
        Cat cat4 = new Cat("test2", 7, 10);

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());
        System.out.println(cat4.hashCode());

        HashSet<Cat> catHashSet = new HashSet<>(Arrays.asList(cat1, cat2, cat3, cat4));
        System.out.println(catHashSet);

        HashSet<Integer> integerHashSet = new HashSet<>(Arrays.asList(1, 3, 5, 6, 7, 22, 4, 1, 6));
        System.out.println(integerHashSet);

        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>(Arrays.asList(1, 3, 5, 6, 7, 22, 4, 1, 6));
        System.out.println(integerLinkedHashSet);

        TreeSet<Integer> integerTreeSet = new TreeSet<>(Arrays.asList(1, 3, 5, 6, 7, 22, 4, 1, 6));
        System.out.println(integerTreeSet);

        TreeSet<Cat> catTreeSet = new TreeSet<>(new CatComparatorByWeight());
        catTreeSet.add(cat1);
        catTreeSet.add(cat2);
        catTreeSet.add(cat3);
        catTreeSet.add(cat4);

        System.out.println(catTreeSet);
    }

    @Override
    public int compareTo(Cat o) {
        return age - o.getAge();
    }
}

