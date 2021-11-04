package Lesson2;

public class CalculateSquare {
    public static void main(String[] args) {
        try {
            System.out.println(calcRectangleSquare(1,-4));

        } catch (OneOrBothRectangleSideIsNegativeException e) {
            System.out.println(e.getMessage());;
        }
    }

    public static int calcRectangleSquare(int a, int b) throws OneOrBothRectangleSideIsNegativeException {

        if(a <= 0 || b <= 0) {
            throw new OneOrBothRectangleSideIsNegativeException("Одна из сторон отрицательная: a = " + a +", b = " + b);
        }
        return a * b;
    }
}
