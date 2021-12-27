package lesson7.project.entity;

public class Weather {
    private String city;
    private String date;
    private double temperature;

    public Weather(String city, String date, double temperature) {
        this.city = city;
        this.date = date;
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public String getDate() {
        return date;
    }

    public String getTemperature() {
        return String.valueOf(temperature);
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", date='" + date + '\'' +
                ", temperature=" + String.format("%.2f", temperature) +
                '}';
    }
}
