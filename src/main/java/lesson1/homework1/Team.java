package lesson1.homework1;

public class Team {
    private String name;
    Tiger[] competitors;

    public Team(String name, Tiger[] competitors) {
        this.name = name;
        this.competitors = competitors;
    }

    public String getName() {
        return name;
    }

    public Tiger[] getCompetitors() {
        return competitors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompetitors(Tiger[] competitors) {
        this.competitors = competitors;
    }

    public void showResults() {
        for(Tiger tiger : competitors) {
            System.out.println(tiger.getResult());
        }
    }
}
