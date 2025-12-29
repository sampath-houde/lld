package tic_tac_toe.entity;

import tic_tac_toe.enums.Symbol;

import java.util.Scanner;

public class Player {

    private final String name;
    private final Symbol symbol;

    public Player(String name, Symbol symbol) {
        this.name  =name;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", symbol=" + symbol +
                '}';
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public Position makeMove() {
        Scanner sn = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Player :: " + this.getName() +"("+ this.getSymbol() + ") . Enter row and col");
                int row = sn.nextInt();
                int col = sn.nextInt();
                return new Position(row, col);
            } catch (Exception e) {
                System.out.println("Entered wrong");
            }
        }


    }
}

