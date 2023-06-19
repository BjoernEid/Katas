package TicTacToe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicTacToeTest {
    @Test
    public void xGoesFirst() {
        TicTacToe game = new TicTacToe();
        Assertions.assertThrows(InvalidPlayerException.class, ()->game.makeMove(Position.Center, Player.O));
    }
}
