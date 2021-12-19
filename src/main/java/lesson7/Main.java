package lesson7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("white", "Lada");

        String carFromJson = objectMapper.writeValueAsString(car);
        System.out.println(carFromJson);

        Car car1 = objectMapper.readValue(carFromJson, Car.class);
        System.out.println(car1);

        List<Car> carList = new ArrayList<>(Arrays.asList(new Car("black", "Mercedes"),
                new Car("red", "Mitsubisi")));

        System.out.println(carList);

        String carListAsJson = objectMapper.writeValueAsString(carList);
        System.out.println(carListAsJson);

        List<Car> carListFromJson = objectMapper.readValue(carListAsJson, new TypeReference<ArrayList<Car>>() {});
        System.out.println(carListFromJson);

        String jsonCarAfterUpdate = "{\"color\":\"white\",\"type\":\"Lada\",\"year\":\"2010\"}";
        //objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Car carAfterUpdate = objectMapper.readValue(jsonCarAfterUpdate, Car.class);
        System.out.println(carAfterUpdate);

        String jsonCarAfterRefactoring = "{\"color\":\"white\",\"model\":\"Lada\"}";
        Car carAfterRefactoring = objectMapper.readValue(jsonCarAfterRefactoring, Car.class);
        System.out.println(carAfterRefactoring);

        Car carWithSeat = new Car("Yellow", "Peugeot");
        carWithSeat.setSeat(new Seat(5));

        String carWithSeatJson = objectMapper.writeValueAsString(carWithSeat);
        System.out.println(carWithSeatJson);

        Car carFromJsonWithSeat = objectMapper.readValue(carWithSeatJson, Car.class);
        System.out.println(carFromJsonWithSeat);
    }
}
