package lesson7;

public class Seat extends CarElement{
    private Integer seatCount;

    public Seat(Integer seatCount) {
        this.seatCount = seatCount;
        setName("сиденье");
    }

    public Seat() {};

    public Integer getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatCount=" + seatCount +
                '}' + super.toString();
    }
}
