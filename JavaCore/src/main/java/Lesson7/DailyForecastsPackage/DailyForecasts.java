package Lesson7.DailyForecastsPackage;


import Lesson2.Array;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.mapper.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class DailyForecasts {

    @JsonProperty(value = "Date")
    private String date;

    @JsonProperty(value = "EpochDate")
    private int epochDate;

    @JsonProperty(value = "Temperature")
    private Temperature temperature;

    @JsonProperty(value = "Day")
    private Day day;

    @JsonProperty(value = "Night")
    private Night night;

    @JsonProperty(value = "Sources")
    private ArrayList<String> sources;

    @JsonProperty(value = "MobileLink")
    private String mobileLink;

    @JsonProperty(value = "Link")
    private String link;


    @JsonIgnore
    private String dayData;
    @JsonIgnore
    private String timeData;



}