package lesson7.project;

import java.io.IOException;
import java.sql.SQLException;

public interface WeatherModel {
    void getWeather(String selectedCity, Period period) throws IOException, SQLException;
    void getSavedToDBWeather(String city);
}
