package TicTacToe;

public class TicTacToe {
    private Player lastPlayer = Player.O;

    public void makeMove(Position position, Player player) throws InvalidPlayerException {
        if (lastPlayer.equals(player)) {
            throw new InvalidPlayerException();
        }
    }
}
