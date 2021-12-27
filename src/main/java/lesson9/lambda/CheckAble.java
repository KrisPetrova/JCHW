package lesson9.lambda;

@FunctionalInterface
public interface CheckAble {
    boolean test(Animal animal);

    default void test1(Animal animal){
    System.out.println(animal);
    }

    @Override
    String toString();
}
