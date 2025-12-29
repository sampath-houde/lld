package snake_ladder.entity.obstacles;

import snake_ladder.entity.enums.ObstacleType;

public class ObstacleFactory {
    public static Obstacle createObstacle(ObstacleType type, int up, int down) throws IllegalAccessException {
        Obstacle obstacle = null;
        switch (type) {
            case LADDER -> obstacle = new Ladder(down, up);
            case SNAKE -> obstacle = new Snake(up, down);
            default -> throw new IllegalAccessException("Unidentify Obstacle type");

        }
        return obstacle;
    }
}
