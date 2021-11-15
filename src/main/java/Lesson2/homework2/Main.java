package Lesson2.homework2;

/*      1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
        2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
        3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета. */

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] table1 = {
                {"1","1","1","1"},
                {"2","2","2","2"},
                {"3","3","3","3"},
                {"4","4","4","4"}
        };

        int sum = 0;

        if(table1.length != 4) {
            throw new MyArraySizeException("Неверная длина массива!");
        }

        for (String[] array : table1) {
            if (array.length != 4) {
                throw new MyArraySizeException("Неверная высота массива!");
            }
        }

            for (int i = 0; i < table1.length; i++) {
                for (int j = 0; j < table1[i].length; j++) {
                    try {
                        sum += Integer.parseInt(table1[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Нечисловое значение поля: " + i + " x " + j);
                    }
                }
            }
            System.out.println(sum);
        }
    }

