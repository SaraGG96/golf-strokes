package edu.teamrocket.golfstrokes;

import java.util.ArrayList;
import java.util.List;

public class ScoreCard {

    private final byte NUM_HOLES = 18;
    private Player playerA;
    private Player playerB;
    private Player playerC;
    private Player playerD;
    private List<Hole> holes;
    private Course playersCourse;

    public ScoreCard() {
        this.holes = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        List<Player> players = new ArrayList<>();
        if (playerA != null) players.add(playerA);
        if (playerB != null) players.add(playerB);
        if (playerC != null) players.add(playerC);
        if (playerD != null) players.add(playerD);
        return players;
    }

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }

    public void setPlayerC(Player playerC) {
        this.playerC = playerC;
    }

    public void setPlayerD(Player playerD) {
        this.playerD = playerD;
    }

    public void setPlayersCourse(Course course) {
        this.playersCourse = course;
    }

    public Byte[] getPlayerCourse(Player player) {
        return playersCourse.getPlayerCourse(player);
    }

    public void addHoles(Hole[] holesArray) {
        for (Hole hole : holesArray) {
            this.holes.add(hole);
        }
    }

    public int getNumHoles() {
        return NUM_HOLES;
    }
}
