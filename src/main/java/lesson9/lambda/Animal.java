package lesson9.lambda;

public class Animal {
    private String name;
    private boolean isCanRun;
    private boolean isCanJump;

    public Animal(String name, boolean isCanRun, boolean isCanJump) {
        this.name = name;
        this.isCanRun = isCanRun;
        this.isCanJump = isCanJump;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanRun() {
        return isCanRun;
    }

    public void setCanRun(boolean canRun) {
        isCanRun = canRun;
    }

    public boolean isCanJump() {
        return isCanJump;
    }

    public void setCanJump(boolean canJump) {
        isCanJump = canJump;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", isCanRun=" + isCanRun +
                ", isCanJump=" + isCanJump +
                '}';
    }
}
