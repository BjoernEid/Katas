package tennis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    void newGameInitializesPlayerScoreLove() {
        Game game = new Game();
        Assertions.assertEquals(Score.LOVE, game.getScore(Player.PLAYER1));
    }

    @Test
    void playerPointsStraightUpToFourty() {
        Game game = new Game();

        game.point(Player.PLAYER1);
        Assertions.assertEquals(Score.FIFTEEN, game.getScore(Player.PLAYER1));

        game.point(Player.PLAYER1);
        Assertions.assertEquals(Score.THIRTY, game.getScore(Player.PLAYER1));

        game.point(Player.PLAYER1);
        Assertions.assertEquals(Score.FOURTY, game.getScore(Player.PLAYER1));

    }

}
