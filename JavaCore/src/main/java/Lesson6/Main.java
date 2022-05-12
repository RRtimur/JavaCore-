package Lesson6;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Main {
    public static void main(String[] args){

        RestAssured.baseURI = "http://dataservice.accuweather.com/";
        Response response = given()
                .when()
                .get("/forecasts/v1/daily/5day/294021?apikey=5U7h6rhEdjXJSrkDoJcttCFJknwB2EuR&language=en");
        System.out.println(response.asPrettyString());


        }
    }

