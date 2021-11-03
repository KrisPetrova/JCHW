package lesson1.homework1;

public class Pool extends Obstacle {
    private int lenght;

    public Pool(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void doIt(Tiger tiger) {
        tiger.swim(lenght);
    }
}
