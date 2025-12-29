package snake_ladder.entity;

import snake_ladder.entity.obstacles.Obstacle;

public class Cell {

    private final int position;
    private Obstacle obstacle;

    Cell(int position, Obstacle obstacle) {
        this.position = position;
        this.obstacle = obstacle;
    }

    Cell(int position) {
        this.position = position;
        this.obstacle = null;
    }

    public Boolean hasObstacle() {
        return obstacle != null;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public int getFinalPosition() {
        return hasObstacle() ? position : obstacle.movePlayer();
    }
}
