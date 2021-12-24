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

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", date='" + date + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
