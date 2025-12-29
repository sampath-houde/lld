package snake_ladder;

import snake_ladder.entity.Board;
import snake_ladder.entity.Dice;
import snake_ladder.entity.Player;
import snake_ladder.entity.enums.ObstacleType;
import snake_ladder.entity.obstacles.Obstacle;
import snake_ladder.entity.obstacles.ObstacleFactory;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private final int noOfSnakes;
    private final int noOfLadders;
    private final int noOfPlayers;
    private final int noOfDices;
    private final Board board;
    private final Dice dice;
    private final Queue<Player> players;
    private final int size;

    Game(int noOfDices, int noOfSnakes, int noOfLadders, int noOfPlayers, int size) throws IllegalAccessException {
        this.noOfDices = noOfDices;
        this.noOfSnakes = noOfSnakes;
        this.noOfLadders = noOfLadders;
        this.noOfPlayers = noOfPlayers;
        this.size = size;

        board = new Board(size);
        dice = new Dice(noOfDices);
        players = new ArrayDeque<Player>();

        initializeObstacles(noOfSnakes, ObstacleType.SNAKE);
        initializeObstacles(noOfLadders, ObstacleType.LADDER);
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    private void initializeObstacles(int count, ObstacleType obstacleType) throws IllegalAccessException {

        while(count > 0) {
            int up = ThreadLocalRandom.current().nextInt(size - 1) + 1;
            int down = ThreadLocalRandom.current().nextInt(size - 1) + 2;

            Obstacle obstacle = ObstacleFactory.createObstacle(obstacleType, up, down);
            if(board.addObstacle(obstacle)) {
                count--;
            }
        }
    }


}
