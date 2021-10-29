package lesson1;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        if(age >= 0) this.age = age;
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

    public abstract void voice();

    public String getName() {
        return name;
    }

}
