package ticTacToe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicTacToeTest {
    @Test
    public void xGoesFirst() {
        TicTacToe game = new TicTacToe();
        Assertions.assertThrows(InvalidPlayerException.class, ()->game.makeMove(Position.Center, Player.O));
    }

  @Test
  public void oGoesNext() throws Exception {
        TicTacToe game = new TicTacToe();
        game.makeMove(Position.UpperLeft, Player.X);

        Assertions.assertThrows(InvalidPlayerException.class, ()->game.makeMove(Position.Center, Player.X));
    }

  @Test
  public void playerCannotPlayOnPlayedPosition() throws Exception {
        TicTacToe game = new TicTacToe();
        game.makeMove(Position.Center, Player.X);

        Assertions.assertThrows(InvalidMoveException.class, ()->game.makeMove(Position.Center, Player.O));
    }

    @Test
    public void centralHorizontalRowWins() throws Exception {
        TicTacToe game = new TicTacToe();
        game.makeMove(Position.Left, Player.X);
        game.makeMove(Position.UpperLeft, Player.O);
        game.makeMove(Position.Right, Player.X);
        game.makeMove(Position.UpperRight, Player.O);

        Assertions.assertThrows(
                GameWonException.class, () -> game.makeMove(Position.Center, Player.X));
    }

    @Test
    public void rightVerticalRowWins() throws Exception {
        TicTacToe game = new TicTacToe();
        game.makeMove(Position.UpperRight, Player.X);
        game.makeMove(Position.UpperLeft, Player.O);
        game.makeMove(Position.Right, Player.X);
        game.makeMove(Position.Left, Player.O);

        Assertions.assertThrows(
                GameWonException.class, () -> game.makeMove(Position.LowerRight, Player.X));
    }

    @Test
    public void DiagonalRowWins() throws Exception {
        TicTacToe game = new TicTacToe();
        game.makeMove(Position.UpperLeft, Player.X);
        game.makeMove(Position.Left, Player.O);
        game.makeMove(Position.Center, Player.X);
        game.makeMove(Position.Right, Player.O);

        Assertions.assertThrows(
        GameWonException.class, () -> game.makeMove(Position.LowerRight, Player.X));
    }
}
