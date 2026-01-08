package patterns.behavoural.strategy2;

import patterns.behavoural.strategy2.strategies.FastSpeedStrategy;

public class SportsCar extends Veichle{
    SportsCar() {
        super(new FastSpeedStrategy());
    }
}
