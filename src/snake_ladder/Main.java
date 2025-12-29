package snake_ladder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter board size: ");
        int size = sc.nextInt();

        System.out.println("Enter number of snakes: ");
        int nSnakes = sc.nextInt();

        System.out.println("Enter number of ladders: ");
        int nLadders = sc.nextInt();

        System.out.println("Enter number of players: ");
        int nPlayers = sc.nextInt();

        System.out.println("Enter number of dices: ");
        int nDices = sc.nextInt();

        Game game = new Game(nDices, nSnakes, nLadders, nPlayers, size);

    }
}
