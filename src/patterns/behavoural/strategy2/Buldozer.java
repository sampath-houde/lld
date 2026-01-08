package patterns.behavoural.strategy2;

import patterns.behavoural.strategy2.strategies.SlowSpeedStrategy;

public class Buldozer extends Veichle{
    Buldozer() {
        super(new SlowSpeedStrategy());
    }
}
