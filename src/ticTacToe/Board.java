package ticTacToe;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private Map<Position, Player> fields = new HashMap<>();

    public void add(Position position, Player player) throws InvalidMoveException {
        if (isMoveInvalid(position)) {
            throw new InvalidMoveException();
        }

        fields.put(position, player);
    }

    private boolean isMoveInvalid(Position position) {
        return fields.containsKey(position);
    }
}
