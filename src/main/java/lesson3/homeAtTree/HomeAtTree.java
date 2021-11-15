package lesson3.homeAtTree;

public class HomeAtTree<T extends Animal & Flyable> {
    private T master;

    public HomeAtTree(T master) {
        this.master = master;
    }

    public T getMaster() {
        return master;
    }

    public void setMaster(T master) {
        this.master = master;
    }

    public static void main(String[] args) {
        HomeAtTree<Bird> home = new HomeAtTree(new Bird());
    }
}
