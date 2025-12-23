package patterns.observer;

public class ScreenDevice implements Observer{
    @Override
    public void update(float temp) {
        System.out.println("Screen Device, Temp: " + temp);
    }
}
