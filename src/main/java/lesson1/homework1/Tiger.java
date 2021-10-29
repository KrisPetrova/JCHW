package lesson1.homework1;

public class Tiger {
    private String name;

    private int maxRunDistance;
    private int maxJumpHeight;
    private int maxSwimDistance;

    private boolean isActive = true;

    public Tiger(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance) {
        if(distance <= maxRunDistance) {
            System.out.println(name + " пробежал дистанцию " + distance + " метров!");
        } else {
            System.out.println(name + " НЕ пробежал дистанцию " + distance + " метров!");
            isActive = false;
        }
    }

    public void jump(int height) {
        if(height <= maxJumpHeight) {
            System.out.println(name + " прыгнул на высоту " + height + " метров!");
        } else {
            System.out.println(name + " НЕ прыгнул на высоту " + height + " метров!");
            isActive = false;
        }
    }

    public void swim(int lenght) {
        if(lenght <= maxSwimDistance) {
            System.out.println(name + " проплыл " + lenght + " метров!");
        } else {
            System.out.println(name + " НЕ проплыл " + lenght + " метров!");
            isActive = false;
        }
    }

    public boolean isActive() {
        return isActive;
    }

    public String getResult() {
        return ("Результат: " + name + " - " + (isActive ? "удачно!" : "не вышло.."));
    }
}
