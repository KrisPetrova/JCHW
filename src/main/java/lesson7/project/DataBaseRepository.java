package lesson7.project;

import lesson7.project.entity.Weather;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseRepository {
    private String insertWeather = "insert into weather(city, localdate, temperature) values(?, ?, ?)";
    private String getWeather = "select + frrom weather";
    private static final String DB_PATH = "jdbc:sqlite:C:\\Users\\User\\Documents\\For Testers\\geekbrains.db";

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean saveWeatherToDatabase(Weather weather) throws SQLException {
        try (Connection connection = DriverManager.getConnection(DB_PATH)) {
            PreparedStatement preparedStatement = connection.prepareStatement(insertWeather);
            preparedStatement.setString(1, weather.getCity());
            preparedStatement.setString(2, weather.getDate());
            preparedStatement.setString(3, weather.getTemperature());
            return preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new  SQLException("Сохранение в базу не выполнено!");
    }

    public void saveWeatherToDatabase(List<Weather> weatherList) {
        //TODO
    }


    public List<Weather> getSavedToDBWeather() {
        List<Weather> weatherList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DB_PATH);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getWeather);
            //TODO complete method body
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return weatherList;
    }
}
