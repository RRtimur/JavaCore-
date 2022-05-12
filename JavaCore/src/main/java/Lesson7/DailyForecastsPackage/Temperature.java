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
public class Temperature {

    @JsonProperty(value = "Minimum")
    private Minimum minimum;
    @JsonProperty(value = "Maximum")
    private Maximum maximum;

}
