package tic_tac_toe;

import tic_tac_toe.entity.Position;
import tic_tac_toe.enums.Symbol;

public class Board {

    Symbol[][] board;
    private final int size;

    Board(int size) {
        board = new Symbol[size][size];
        this.size = size;

        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                board[i][j] = Symbol.EMPTY;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j].getSymbol());
                if (j < size - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();

            if (i < size - 1) {
                for (int k = 0; k < size; k++) {
                    System.out.print("---");
                    if (k < size - 1) {
                        System.out.print("+");
                    }
                }
                System.out.println();
            }
        }
    }


    public boolean isValidMove(Position pos) {
        return pos != null && pos.getRow() >=0 && pos.getRow() < size && pos.getCol() >= 0 && pos.getCol() < size && board[pos.getRow()][pos.getCol()] == Symbol.EMPTY;
    }

    public void makeMove(Symbol symbol, Position pos) {
        board[pos.getRow()][pos.getCol()] = symbol;
    }

    public boolean hasWinner() {
        // rows
        for (int i = 0; i < size; i++) {
            if (allSame(board[i])) return true;
        }

        // columns
        for (int col = 0; col < size; col++) {
            Symbol[] column = new Symbol[size];
            for (int row = 0; row < size; row++) {
                column[row] = board[row][col];
            }
            if (allSame(column)) return true;
        }

        // diagonals
        Symbol[] diag1 = new Symbol[size];
        Symbol[] diag2 = new Symbol[size];
        for (int i = 0; i < size; i++) {
            diag1[i] = board[i][i];
            diag2[i] = board[i][size - 1 - i];
        }

        return allSame(diag1) || allSame(diag2);
    }

    private boolean allSame(Symbol[] line) {
        Symbol first = line[0];
        if (first == Symbol.EMPTY) return false;

        for(Symbol symbol: line) {
            if (first != symbol)
                return false;
        }
        return true;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == Symbol.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
