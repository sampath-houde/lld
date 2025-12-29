package snake_ladder.entity;

import snake_ladder.entity.obstacles.Obstacle;

public class Board {

    private final int size;
    private final int sideLength;
    private final Cell[][] grid;

    public Board(int size) {
        this.size = size;
        this.sideLength = (int) Math.sqrt(size);
        grid = new Cell[size][size];
        initialize();
    }

    public Cell getCell(int position) {
        return grid[getRow(position)][getCol(position)];
    }

    private int getRow(int position) {
        int row = position - 1 / sideLength;
        return sideLength - 1 - row;
    }

    public boolean addObstacle(Obstacle obstacle) {
        Cell srcCell = getCell(obstacle.getSrc());
        Cell destCell = getCell(obstacle.getDest());

        if (srcCell.hasObstacle() || destCell.hasObstacle()) {
            return false;
        }
        srcCell.setObstacle(obstacle);
        return true;
    }

    private int getCol(int position) {
        int row = getRow(position);
        int col = (position - 1) % sideLength;
        return (row % 2 == 0) ? sideLength - 1 - col : col;
    }

    private void initialize() {
        int position = 1;
        boolean leftToRight = true;
        for (int row = sideLength-1; row >=0; row--) {
            if (leftToRight) {
                for (int col = 0; col<sideLength; col++) {
                    grid[row][col] = new Cell(position++);
                }
            } else {
                for (int col = sideLength-1; col>=0; col--) {
                    grid[row][col] = new Cell(position++);
                }
            }
            leftToRight = !leftToRight;
        }
    }

    public int getNewPosition(Player player, int offset) {
        int newPosition = player.getPosition() + offset;

        if (newPosition > size) {
            System.out.println("You are going out of board. Better luck next time!");
            return player.getPosition();
        }

        Cell cell = grid[getRow(newPosition)][getCol(newPosition)];
        int finalPosition = cell.getFinalPosition();

        if (finalPosition < newPosition) {
            System.out.println("Oops snake bite you. " +player.getPlayerName()+" You went from "+ player.getPosition() + " to " + finalPosition );
        } else if (newPosition < finalPosition ){
            System.out.println("Congratulations! " +player.getPlayerName()+" You climbed the ladder. You went from "+ player.getPosition() + " to " + finalPosition );
        } else {
            System.out.println("Player " + player.getPlayerName() + " moved from " + player.getPosition() + " to " + finalPosition);
        }
        return finalPosition;
    }

}
