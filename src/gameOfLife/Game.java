package gameOfLife;

import ticTacToe.Board;

import java.util.HashSet;
import java.util.Set;

public class Game {

    private Set<Cell> livingCells = new HashSet<Cell>();

    public void addCell(Cell cell) {
        livingCells.add(cell);
    }

    public void iterate() {
        for (Cell cell : livingCells) {
            int numNeighbours = getNumberOfNeighbours(cell);
        }
    }

    private int getNumberOfNeighbours(Cell cell) {
        int numNeighbours = 0;
        for (Cell neighbourCell : livingCells) {
            if (cell.isNeighbour(neighbourCell))
                numNeighbours++;
        }

        return numNeighbours;
    }

    public boolean contains(Cell cell) {
        return livingCells.contains(cell);
    }
}
