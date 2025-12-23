package patterns.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        MobileDevice mobileDevice = new MobileDevice("Sampath");
        ScreenDevice screenDevice = new ScreenDevice();
        weatherStation.attach(mobileDevice);
        weatherStation.attach(screenDevice);
        weatherStation.detach(screenDevice);
        weatherStation.setTemp(30);
    }
}
