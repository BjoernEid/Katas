package tennis;

public enum Player {
    PLAYER1(0),
    PLAYER2(1);

    private int playerNumber;
    private Player(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }
}
