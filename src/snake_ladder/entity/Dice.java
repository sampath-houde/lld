package snake_ladder.entity;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    private final int noOfDices;

    public Dice(int noOfDices) {
        this.noOfDices = noOfDices;
    }

    public int roll() {
        int sum = 0;
        for (int i = 0; i < noOfDices; i++) {
            sum += ThreadLocalRandom.current().nextInt(1, 7);
        }
        return sum;

    }

}
