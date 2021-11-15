package lesson3;

import java.util.Arrays;

public class NumbersBox<T extends Number> {
    private T[] array;

    public NumbersBox(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public double calcAverage(){
        double sum = 0.0;
        for(T number : array) {
            sum = sum + number.doubleValue();
        }
        return sum / getArray().length;
    }

    public boolean isSameAverage(NumbersBox<?> boxToCompare) {
        return Math.abs(calcAverage() - boxToCompare.calcAverage()) < 0.0001;
    }

    @Override
    public String toString() {
        return "NumbersBox{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public static <U extends Number> U getFirstElement(NumbersBox<U> numbersBox) {
        return numbersBox.getArray()[0];
    }

    public static void main(String[] args) {
        NumbersBox<Integer> integerNumbersBox = new NumbersBox<>(1, 3, 4, 5, 6, 7, 7);
        System.out.println(integerNumbersBox.calcAverage());

        NumbersBox<Integer> integerNumbersBox2 = new NumbersBox<>(1, 3, 4, 5, 6, 7, 7);

        System.out.println(integerNumbersBox.isSameAverage(integerNumbersBox2));

        NumbersBox<Double> doubleNumbersBox = new NumbersBox<>(2.0, 4.0);

        System.out.println(integerNumbersBox.isSameAverage(doubleNumbersBox));
        System.out.println(getFirstElement(doubleNumbersBox));
        System.out.println(getFirstElement(integerNumbersBox));

    }
}
