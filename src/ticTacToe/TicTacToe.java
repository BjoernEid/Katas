package ticTacToe;

import java.util.Vector;

public class TicTacToe {
    private Player lastPlayer = Player.O;
    private Board board = new Board();

  public void makeMove(Position position, Player player)
      throws InvalidPlayerException, InvalidMoveException {
        if (lastPlayer.equals(player)) {
            throw new InvalidPlayerException();
        }

        board.add(position, player);
        togglePlayer(player);
    }

    private void togglePlayer(Player player) {
        lastPlayer = player;
    }
}
