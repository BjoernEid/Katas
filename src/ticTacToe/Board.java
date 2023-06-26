package ticTacToe;

import java.util.*;

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

    public List findAllPositionsForPlayer(Player player) {
        return fields.entrySet().stream().filter(
        entry -> entry.getValue().equals(player)).map(Map.Entry::getKey).toList();
    }
}
