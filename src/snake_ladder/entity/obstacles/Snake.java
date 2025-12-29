package snake_ladder.entity.obstacles;

import snake_ladder.entity.enums.ObstacleType;

public class Snake extends Obstacle {

    Snake(int head, int tail) {
        super(head, tail);
    }


    @Override
    public ObstacleType getObstacleType() {
        return ObstacleType.SNAKE;
    }
}
