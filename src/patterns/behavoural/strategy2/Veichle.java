package patterns.behavoural.strategy2;

public class Veichle {

    private final Drive driveStrategy;

    Veichle(Drive drive) {
        this.driveStrategy = drive;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
