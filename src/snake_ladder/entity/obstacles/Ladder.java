package snake_ladder.entity.obstacles;

import snake_ladder.entity.enums.ObstacleType;

public class Ladder extends Obstacle{
    Ladder(int bottom, int top) {
        super(bottom, top);
    }

    @Override
    public ObstacleType getObstacleType() {
        return ObstacleType.LADDER;
    }
}
