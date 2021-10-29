package lesson1;

public class Turtle extends Animal implements CanSwim {

    private double swimmingSpeed;

    public Turtle(String name, String color, int age) {
        super(name, color, age);
    }

    public void voice() {
        System.out.println("Черепаха фыркает");
    }

    @Override
    public double swim(Pool pool) {
        return pool.getLength() / swimmingSpeed;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}
