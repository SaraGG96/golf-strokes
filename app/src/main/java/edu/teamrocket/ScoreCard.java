package edu.teamrocket;
import java.util.List;

public class ScoreCard {

    private static Byte NUM_HOLES;
    private Player playerA;
    private Player playerB;
    private Player playerC;
    private Player playerD;
    private Course playersCourse;

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



}
