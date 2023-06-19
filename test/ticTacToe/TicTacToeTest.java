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
    public void oGoesNext() throws InvalidPlayerException {
        TicTacToe game = new TicTacToe();
        game.makeMove(Position.UpperLeft, Player.X);

        Assertions.assertThrows(InvalidPlayerException.class, ()->game.makeMove(Position.Center, Player.X));
    }

    @Test
    public void playerCannotPlayOnPlayedPosition() throws InvalidPlayerException {
        TicTacToe game = new TicTacToe();
        game.makeMove(Position.Center, Player.X);

        Assertions.assertThrows(InvalidMoveException.class, ()->game.makeMove(Position.Center, Player.O));
    }
}
