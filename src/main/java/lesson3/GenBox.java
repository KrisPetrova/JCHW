package lesson3;

import java.util.ArrayList;
import java.util.List;

public class GenBox<T> {
    private T object;

    public GenBox(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    /*public static T test(){
       return T;
    };

    public void test2(){
        T test = new T(123);
        T[] testArr = new T[10];
    }*/


    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "GenBox{" +
                "object=" + object +
                '}';
    }

    public static void main(String[] args) {
        GenBox<Integer> box1 = new GenBox(5);
        GenBox<Integer> box2 = new GenBox(10);

        int sum = box1.getObject() + box2.getObject();
        System.out.println(sum);

        GenBox<String> stringGenBox = new GenBox<>("test");

        GenBox intBox = new GenBox(5);

        // Integer a = new Integer(5);
       // Number b = a;

        List<Integer> integerList = new ArrayList<>();
        //List<Number> numberList = integerList;






    }
















}
