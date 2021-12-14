package lesson6.homework6;

/*1. С помощью http запроса получить в виде json строки погоду в Санкт-Петербурге на период времени,
пересекающийся со следующим занятием (например, выборка погода на следующие 5 дней - подойдет)
2. Подобрать источник самостоятельно. Можно использовать api accuweather, порядок следующий:
зарегистрироваться, зарегистрировать тестовое приложение для получения api ключа,
найдите нужный endpoint и изучите документацию. Бесплатный тарифный план предполагает получение
погоды не более чем на 5 дней вперед (этого достаточно для выполнения д/з).*/

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class FiveDaysWeather {
    //http://dataservice.accuweather.com/forecasts/v1/daily/5day/
        private  static final String PROTOCOL = "http";
        private  static final String BASE_HOST = "dataservice.accuweather.com";
        private  static final String FORECASTS = "forecasts";
        private  static final String VERSION = "v1";
        private  static final String DAILY = "daily";
        private static final String FIVE_DAIS = "5day";
        private  static final String API_KEY = "gjZGBGZPuP6giqbbzBxyTAbWnT7X0V4a";
        private  static final String API_KEY_QUERY_PARAM = "apikey";
        private  static final String CITIES = "cities";

        private  static final OkHttpClient okHttpClient = new OkHttpClient();
        private static final ObjectMapper objectMapper = new ObjectMapper();

        public static void getWeather(String selectedCity, String FIVE_DAIS) throws IOException {

                    HttpUrl httpUrl5 = new HttpUrl.Builder()
                            .scheme(PROTOCOL)
                            .host(BASE_HOST)
                            .addPathSegment(FORECASTS)
                            .addPathSegment(VERSION)
                            .addPathSegment(DAILY)
                            .addPathSegment(FIVE_DAIS)
                            .addPathSegment("295212")
                            .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                            .build();

                    Request request5 = new Request.Builder()
                            .url(httpUrl5)
                            .build();

                    Response fiveDaysForecastResponse = okHttpClient.newCall(request5).execute();
                    String weatherResponse = fiveDaysForecastResponse.body().string();
                    System.out.println(weatherResponse);
        }

    public static void main(String[] args) throws IOException {
        getWeather("295212", FIVE_DAIS);
    }

}
