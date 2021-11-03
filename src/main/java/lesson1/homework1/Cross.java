package lesson1.homework1;

public class Cross extends Obstacle {
    private int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Tiger tiger) {
        tiger.run(distance);
    }
}
