package patterns.observer;

public class MobileDevice implements Observer {

    private final String deviceName;

    public MobileDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void update(float temp) {
        System.out.println("Device Name " + deviceName + " Temp: " + temp);
    }
}
