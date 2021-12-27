package lesson7.project;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Controller {
    private WeatherModel weatherModel = new AccuweatherModel();
    private Map<Integer, Period> variants = new HashMap<>();

    public Controller() {
        this.variants.put(1, Period.NOW);
        this.variants.put(5, Period.FIVE_DAYS);
        this.variants.put(2, Period.DB);
    }

    public void getWeather(String userInput, String selectedCity) throws IOException {
        Integer userIntInput = Integer.parseInt(userInput);

        switch (variants.get(userIntInput)) {
            case NOW:
                try {
                weatherModel.getWeather(selectedCity, Period.NOW);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case FIVE_DAYS:
                try {
                weatherModel.getWeather(selectedCity, Period.FIVE_DAYS);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case DB:
                weatherModel.getSavedToDBWeather(selectedCity);
                break;
        }
    }
}
