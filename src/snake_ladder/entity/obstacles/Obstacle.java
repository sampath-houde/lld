package snake_ladder.entity.obstacles;


import snake_ladder.entity.enums.ObstacleType;

public abstract class Obstacle {

    int src;
    int dest;

    public int getSrc() {
        return src;
    }

    public int getDest() {
        return dest;
    }

    Obstacle(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }

    public int movePlayer() {
        return dest;
    }

    public abstract ObstacleType getObstacleType();
}
