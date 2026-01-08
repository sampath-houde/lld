package patterns.behavoural.strategy2.strategies;

import patterns.behavoural.strategy2.Drive;

public class SlowSpeedStrategy implements Drive {
    @Override
    public void drive() {
        System.out.println("Slow speed");
    }
}
