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
            // connection.close();
            return preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new  SQLException("Сохранение в базу не выполнено!");
    }

    public List<Weather> getSavedToDBWeather(String city) {
        System.out.println("****************");
        List<Weather> weatherList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DB_PATH);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getWeather);
            while (resultSet.next()) {
                //   System.out.print(resultSet.getInt("id"));
                System.out.print("Expected temperature at  " + resultSet.getString("city"));
                System.out.print(" on  " + resultSet.getString("localDate") + " is ");
                System.out.println( String.format("%.2f",resultSet.getDouble("temperature")) +"C");
                weatherList.add(new Weather(resultSet.getString("city"),
                        resultSet.getString("localDate"),
                        resultSet.getDouble("temperature")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return weatherList;
    }

    public void saveWeatherToDataBase(Weather weather) {
    }
}
