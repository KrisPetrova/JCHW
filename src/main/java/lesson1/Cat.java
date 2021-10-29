package lesson1;

import java.util.Objects;

public class Cat extends Animal implements CanSwim {

    private double swimmingSpeed;
    private boolean isWild;

     public Cat(String name, String color, int age) {
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

    @Override
     public String toString() {
         return "Cat{" +
                 "name='" + name + '\'' +
                 ", color='" + color + '\'' +
                 ", age=" + age +
                 '}';
     }

     @Override
     public boolean equals(Object obj) {
         if (this == obj) return true;
         if (obj == null || getClass() != obj.getClass()) return false;

         Cat cat = (Cat) obj;

         return  age == cat.age
                 && Objects.equals(name, cat.name)
                 && Objects.equals(color, cat.color);
     }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }

    public void voice() {
        System.out.println("Кот мяукает");
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
