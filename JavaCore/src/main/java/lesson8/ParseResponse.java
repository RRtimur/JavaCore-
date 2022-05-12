package lesson8;

import Lesson7.DailyForecastsPackage.DailyForecasts;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class ParseResponse {
    private Response response;


    public ParseResponse(){
        RestAssured.baseURI = "http://dataservice.accuweather.com/";
        response = given()
                .when()
                .get("/forecasts/v1/daily/5day/294021?apikey=5U7h6rhEdjXJSrkDoJcttCFJknwB2EuR&language=en");


    }
    @SneakyThrows
    public List<DailyForecasts> getDailyForecasts(){
        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNode = objectMapper
                .readTree(response.asPrettyString())
                .at("/DailyForecasts");

        List<DailyForecasts> dailyForecasts = new ArrayList<>();

        if(jsonNode.isArray()){
            for (JsonNode arrayItem : jsonNode) {
                dailyForecasts.add(objectMapper.convertValue(arrayItem,DailyForecasts.class));
            }

        }

        return dailyForecasts;
    }

}