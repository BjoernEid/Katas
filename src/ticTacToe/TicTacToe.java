package ticTacToe;

import java.util.List;

public class TicTacToe {
    private Player lastPlayer = Player.O;
    private Board board = new Board();
    private static final List<List<Position>> rows = List.of(
            List.of(Position.UpperLeft, Position.UpperCenter, Position.UpperRight),
            List.of(Position.Left, Position.Center, Position.Right),
            List.of(Position.LowerLeft, Position.LowerCenter, Position.LowerRight),

            List.of(Position.UpperLeft, Position.Left, Position.LowerLeft),
            List.of(Position.UpperCenter, Position.Center, Position.LowerCenter),
            List.of(Position.UpperRight, Position.Right, Position.LowerRight),

            List.of(Position.UpperLeft, Position.Center, Position.LowerRight),
            List.of(Position.UpperRight, Position.Center, Position.LowerLeft)
    );

  public void makeMove(Position position, Player player)
      throws InvalidPlayerException, InvalidMoveException, GameWonException {
        if (lastPlayer.equals(player)) {
            throw new InvalidPlayerException();
        }

        board.add(position, player);
        checkIfPlayerWins(player);
        togglePlayer(player);
    }

    private void checkIfPlayerWins(Player player) throws GameWonException {
        var positions = board.findAllPositionsForPlayer(player);
        for (List row : rows) {
            if(positions.containsAll(row)) {
                throw new GameWonException();
            }
        }
    }

    private void togglePlayer(Player player) {
        lastPlayer = player;
    }
}
