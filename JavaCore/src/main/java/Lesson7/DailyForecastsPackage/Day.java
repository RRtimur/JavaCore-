package Lesson7.DailyForecastsPackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Day {
    @JsonProperty(value = "Icon")
    private String icon;
    @JsonProperty(value = "IconPhrase")
    private String iconPhrase;
    @JsonProperty(value = "HasPrecipitation")
    private boolean hasPrecipitation;
    @JsonProperty(value = "PrecipitationType")
    private String precipitationType;
    @JsonProperty(value = "PrecipitationIntensity")
    private String precipitationIntensity;



}
