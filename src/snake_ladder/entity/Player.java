package snake_ladder.entity;

public class Player {
    private final String playerName;
    private int position;

    public String getPlayerName() {
        return playerName;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    Player(String playerName) {
        this.playerName = playerName;
        this.position = 0;
    }


}
