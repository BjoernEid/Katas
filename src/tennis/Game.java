package tennis;

public class Game {
    Score[] scores = new Score[2];

    public Game() {
        scores[0] = Score.LOVE;
        scores[1] = Score.LOVE;
    }

    public Score getScore(Player player) {
        return scores[player.getPlayerNumber()];
    }

    public void point(Player player) {
        scores[player.getPlayerNumber()] = Score.FIFTEEN;
    }

}
