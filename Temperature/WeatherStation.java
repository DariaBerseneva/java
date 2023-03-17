public class WeatherStation {
    public static void  main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(-280, 87, 771);
        weatherData.setMeasurements(-26, 89, 770);
        weatherData.setMeasurements(-24, 90, 768);
    }
}