package lesson1;

public class Pool {
    private double length;

    public Pool(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getTimeToOvercome(CanSwim swimmer) {
        return swimmer.swim(this);
    }

}
