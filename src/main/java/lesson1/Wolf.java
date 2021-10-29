package lesson1;

public class Wolf extends Animal implements CanSwim {

    private double swimmingSpeed;

    public Wolf(String name, String color, int age) {
        super(name, color, age);
    }

    public void setAge(int age) {
        if(age >= 0) this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("Волк воет");
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
