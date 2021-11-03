package lesson1.homework1;

public class Course {
    private Obstacle[] course = {new Cross(1000), new Pool(500), new Wall(5)};

    public void doIt(Team team){
        for (Tiger tiger : team.getCompetitors()) {
            for (Obstacle o : course) {
                o.doIt(tiger);
                if(!tiger.isActive()) break;
            }
            tiger.getResult();
        }
    }
}
