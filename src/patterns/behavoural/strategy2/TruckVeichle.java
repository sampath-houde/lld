package patterns.behavoural.strategy2;

import patterns.behavoural.strategy2.strategies.NormalSpeedStrategy;

public class TruckVeichle extends Veichle{
    TruckVeichle() {
        super(new NormalSpeedStrategy());
    }
}
