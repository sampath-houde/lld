package patterns.behavoural.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private Float temp;
    private List<Observer> observerList = new ArrayList<>();

    public void setTemp(float newTemp) {
        temp = newTemp;
        notifyObservers();
    }



    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observerList) {
            observer.update(temp);
        }
    }
}
