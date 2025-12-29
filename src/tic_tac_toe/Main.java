package tic_tac_toe;

import tic_tac_toe.entity.Player;
import tic_tac_toe.enums.Symbol;

public class Main {
    public static void main(String[] args) {

        Player playerx = new Player("sampath", Symbol.X);
        Player playerO = new Player("sanket", Symbol.O);
        BoardGames game = new TicTacToeGame(new Board(3), playerx, playerO);

        game.play();
    }
}
