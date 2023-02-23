package observer;

import static java.lang.System.out;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay (WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        out.println("Current conditions: " + "Temperature : " + temperature + " Humidity " + humidity);
    }

    @Override
    public void update() {
//        this.temperature = temp;
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
