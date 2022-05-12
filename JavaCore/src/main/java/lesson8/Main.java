package lesson8;


import Lesson7.DailyForecastsPackage.DailyForecasts;

public class Main {
    public static void main(String[] args) {


        DBConnection dbConnection = new DBConnection();
        ParseResponse parseResponse = new ParseResponse();

        for (DailyForecasts dailyForecast : parseResponse.getDailyForecasts()) {

            dbConnection.insertValue("Moscow",
                    dailyForecast.getDate(),
                    dailyForecast.getDay().getIconPhrase(),
                    dailyForecast.getTemperature().getMaximum().getValue());

        }

        System.out.println(dbConnection.getValue("city","temperature", 58));

    }
}

