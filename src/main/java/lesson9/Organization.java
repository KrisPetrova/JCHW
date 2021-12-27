package lesson9;

import java.util.List;

public class Organization {
    private int id;
    private String name;
    private List<Worker> workers;

    public Organization(int id, String name, List<Worker> workers) {
        this.id = id;
        this.name = name;
        this.workers = workers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", workers=" + workers +
                '}';
    }
}
