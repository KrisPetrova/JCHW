package lesson6;

import okhttp3.*;

import java.io.IOException;

public class RestfulBookerExamples {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();

        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("https")
                .host("restful-booker.herokuapp.com")
                .addPathSegment("auth")
                .build();

        String authBody = "{\n" + " \"username\" : \"admin\", " +
                "\n" + " \"password\" : \"password123\"\n" + " }";

        RequestBody requestAuthBody = RequestBody.create(authBody, MediaType.parse("JSON"));

        Request authRequest = new Request.Builder()
                .url(httpUrl)
                .addHeader("Content-Type", "application/json")
                .post(requestAuthBody)
                .build();

        Response response = okHttpClient.newCall(authRequest).execute();

        System.out.println(response.isSuccessful());

        String responseBodyWithToken = response.body().string();
        System.out.println(responseBodyWithToken);

        String token = responseBodyWithToken.split(":")[1];
        //token = token.replace("\"", "");
        //token = token.replace("}", "");

        token = token.replaceAll("[\"}]", "");

        System.out.println(token);

        String createBodyJson = "{\n" + " \"firstname\" : \"Jim\",\n" +
                " \"lastname\" : \"Brown\",\n" +
                " \"totalprice\" : 111,\n" +
                " \"depositpaid\" : true,\n" +
                " \"bookingdates\" : {\n" +
                " \"checkin\" : \" 2018-01-01\",\n" +
                " \"checkout\" : \" 2019-01-01\"\n" +
                " },\n" +
                " \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        RequestBody requestCreateBookingBody = RequestBody.create(createBodyJson, MediaType.parse("JSON"));

        Request requestCreateBooking = new Request.Builder()
                .url("https://restful-booker.herokuapp.com/booking")
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .addHeader("Cookie", String.format("token=%s", token))
                .post(requestCreateBookingBody)
                .build();

        Response createBookingResponse = okHttpClient.newCall(requestCreateBooking).execute();

        System.out.println(createBookingResponse.body().string());



















    }
}
