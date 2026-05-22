package edu.teamrocket;
import java.util.ArrayList;
import java.util.List;

public class ScoreCard {

    private static Byte NUM_HOLES;
    private Player playerA;
    private Player playerB;
    private Player playerC;
    private Player playerD;
    private Course playersCourse;
    private final List<Hole> holes = new ArrayList<Hole>();

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

    public Player getPlayerA() {
        return playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public Player getPlayerC() {
        return playerC;
    }

    public Player getPlayerD() {
        return playerD;
    }

    public List<Player> getPlayers() {
        List<Player> players = new ArrayList<>();
        if (playerA != null) players.add(playerA);
        if (playerB != null) players.add(playerB);
        if (playerC != null) players.add(playerC);
        if (playerD != null) players.add(playerD);
        return players;
    }

    public Course getPlayersCourse() {
        return playersCourse;
    }

    public byte[] getPlayerCourse(Player player) {
        if (playersCourse == null || player == null) return null;
        return playersCourse.getPlayerCourse(player);
    }

    public void addHoles(Byte[] holePar) {
        byte holeNumber = 1;
        for (Byte par : holePar) {
            this.holes.add(new Hole(holeNumber++, par));
        }
    }

    public List<Hole> getHoles() {
        return holes;
    }
    
    public byte getNumHoles() {
        return (byte) this.holes.size();
    }

}
