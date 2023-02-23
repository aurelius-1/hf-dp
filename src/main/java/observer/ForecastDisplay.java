package observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        //sout
    }

    @Override
    public void update() {
        this.lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
    }
}
