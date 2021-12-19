package lesson7.project;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class AccuweatherModel implements WeatherModel{

    //http://dataservice.accuweather.com/forecasts/v1/daily/1day/
    private  static final String PROTOCOL = "https";
    private  static final String BASE_HOST = "dataservice.accuweather.com";
    private  static final String FORECASTS = "forecasts";
    private  static final String VERSION = "v1";
    private  static final String DAILY = "daily";
    private  static final String ONE_DAY = "1day";
    private  static final String API_KEY = "5PiLO0ToHZCGVkafjdlNSLR6QHjEZbX4";
    private  static final String API_KEY_QUERY_PARAM = "apikey";
    private  static final String LOCATIONS = "locations";
    private  static final String CITIES = "cities";
    private  static final String AUTOCOMPLETE = "autocomplete";
    //private static final String FIVE_DAIS = "5day";
    //http://dataservice.accuweather.com/forecasts/v1/daily/5day/

    private  static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();


    @Override
    public void getWeather(String selectedCity, Period period) throws IOException {
        switch(period) {
            case NOW:
                HttpUrl httpUrl = new HttpUrl.Builder()
                        .scheme(PROTOCOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(ONE_DAY)
                        .addPathSegment(detectedCityKey(selectedCity))
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .build();

                Request request = new Request.Builder()
                        .url(httpUrl)
                        .build();

                Response oneDayForecastResponse = okHttpClient.newCall(request).execute();
                String weatherResponse = oneDayForecastResponse.body().string();
                System.out.println(weatherResponse);
                //TODO: сделать человекочитаемый вывод погоды. Выбрать параметры для вывода на своё усмотрение
                //Например: Погода в городе Москва - 5 градусов по Цельсию Expect showers late Monday night

                break;
                
            case FIVE_DAYS:
                //TODO*: реализовать вывод погоды на 5 дней

                /* HttpUrl httpUrl5 = new HttpUrl.Builder()
                        .scheme(PROTOCOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        //.addPathSegment(FIVE_DAIS)
                        .addPathSegment("295212")
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .build();

                Request request5 = new Request.Builder()
                        .url(httpUrl5)
                        .build();

                Response fiveDaysForecastResponse = okHttpClient.newCall(request5).execute();*/

                break;
        }
    }

    private static String detectedCityKey(String selectedCity) throws IOException {
        //http://dataservice.accuweather.com/locations/v1/cities/autocomplete
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOCOL)
                .host(BASE_HOST)
                .addPathSegment(LOCATIONS)
                .addPathSegment(VERSION)
                .addPathSegment(CITIES)
                .addPathSegment(AUTOCOMPLETE)
                .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                .addQueryParameter("q", selectedCity)
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .get()
                .addHeader("accept", "application/json")
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String responseString = response.body().string();

        String cityKey = objectMapper.readTree(responseString).get(0).at("/Key").asText();

        return cityKey;
    }
}







