package Lesson7;

import Lesson7.DailyForecastsPackage.DailyForecasts;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static io.restassured.RestAssured.given;

@Getter
@Setter
public class WeatherResponse {

    private int c;

    @SneakyThrows
    public void response(){
        RestAssured.baseURI = "http://dataservice.accuweather.com/";
        Response response = given()
                .when()
                .get("/forecasts/v1/daily/5day/294021?apikey=5U7h6rhEdjXJSrkDoJcttCFJknwB2EuR&language=en");

        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNode = objectMapper
                .readTree(response.asPrettyString())
                .at("/DailyForecasts");

        List<DailyForecasts> dailyForecasts = new ArrayList<>();

        if (jsonNode.isArray()) {
            for (JsonNode arrayItem : jsonNode) {
                dailyForecasts.add(objectMapper.convertValue(arrayItem, DailyForecasts.class));
            }

        }

        for (DailyForecasts dailyForecast : dailyForecasts) {
            dataParse(dailyForecast);
            System.out.println("В Москве, на " + dailyForecast.getDayData() +
                    ", время " +dailyForecast.getTimeData() +
                    ", максимальная температура - " + fToCDay(dailyForecast) +
                    ", минимальная температура - " + fToCNight(dailyForecast) +
                    ",погода днем - " + dailyForecast.getDay().getIconPhrase() +
                    ", ночью - " + dailyForecast.getNight().getIconPhrase());
        }

    }

    public int fToCDay(DailyForecasts dailyForecasts){

        c = (dailyForecasts.getTemperature().getMaximum().getValue() - 32) * 5/9;
        return c;
    }
    public int fToCNight(DailyForecasts dailyForecasts){

        c = (dailyForecasts.getTemperature().getMinimum().getValue() - 32) * 5/9;
        return c;
    }

    public void dataParse(DailyForecasts dailyForecasts) throws ParseException {
        String str;
        String str1;

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        Date date = df.parse(dailyForecasts.getDate());

        SimpleDateFormat newDf = new SimpleDateFormat("yyyy-MM-dd");
        str = newDf.format(date);
        dailyForecasts.setDayData(str);

        SimpleDateFormat newTf = new SimpleDateFormat("HH:mmXXX");
        str1 = newTf.format(date);
        dailyForecasts.setTimeData(str1);



    }

}
