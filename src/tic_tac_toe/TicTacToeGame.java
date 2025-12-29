package tic_tac_toe;

import tic_tac_toe.entity.Player;
import tic_tac_toe.entity.Position;
import tic_tac_toe.enums.GameStatus;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class TicTacToeGame implements BoardGames{

    private GameStatus gameStatus;
    private final Board board;
    private final List<Player> players;

    TicTacToeGame(Board board, Player playerX, Player playerO) {
        this.board = board;
        this.gameStatus = GameStatus.IN_PROGRESS;
        this.players = List.of(playerO, playerX);
    }

    @Override
    public void play() {

        Player winner = null;

        Player currentPlayer = getCurrentPlayer();
        while(gameStatus != GameStatus.OVER) {
            Position move = currentPlayer.makeMove();

            if (!board.isValidMove(move)) {
                System.out.println("Invalid move :: Please enter again " + currentPlayer.getName());
                continue;
            }

            board.makeMove(currentPlayer.getSymbol(), move);
            board.printBoard();

            if(board.hasWinner()) {
                gameStatus = GameStatus.OVER;
                winner = currentPlayer;
            } else if(board.isFull()){
                gameStatus = GameStatus.OVER;
            }
            currentPlayer = switchTurn(currentPlayer);
        }
        System.out.println("Winner is :: " + winner);
    }

    @Override
    public void stop() {

    }

    Player getCurrentPlayer() {
        Random random = new Random();
        return players.get(random.nextInt(2));
    }

    Player switchTurn(Player currentPlayer) {
        return players.stream().filter(player -> !Objects.equals(player.getName(), currentPlayer.getName())).toList().get(0);
    }
}
