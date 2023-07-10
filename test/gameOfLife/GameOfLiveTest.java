package gameOfLife;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameOfLiveTest {
    @Test
    public void anyLiveCellWithLessThan2NeighboursDies() {
        anyLiveCellWith0NeighboursDies();
        anyLiveCellWith1NeighbourDies();
    }

    private static void anyLiveCellWith0NeighboursDies() {
        Game game = new Game();
        game.addCell(new Cell(3,3));
        game.iterate();

        Assertions.assertEquals(false, game.contains(new Cell(3,3)));
    }

    private static void anyLiveCellWith1NeighbourDies() {
        Game game = new Game();
        game.addCell(new Cell(1,3));
        game.addCell(new Cell(2,3));
        game.iterate();

        Assertions.assertEquals(false, game.contains(new Cell(2,3)));
    }

    @Test
    public void anyLiveCellWith2or3LiveNeighboursSurvives() {
        Game game = new Game();
        game.addCell(new Cell(1,3));
        game.addCell(new Cell(2,3));
        game.addCell(new Cell(3,3));
        game.iterate();

        Assertions.assertEquals(true, game.contains(new Cell(2,3)));
    }

    @Test
    public void anyLiveCellWithMoreThan3LiveNeighboursDies() {

    }

    @Test
    public void anyDeadCellWithExactly3LiveNeighboursIsBorn() {

    }
}
