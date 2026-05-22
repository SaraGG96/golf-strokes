package edu.teamrocket;

public class Player {

    private String initials;
    private Byte handicap;
    private Short score;
    private Short points;

    public Player(String initials, Byte handicap) {
        this.initials = initials;
        this.handicap = handicap;
        this.score = 0;
        this.points = 0;
    }

    public String getInitials() {
        return initials;
    }

    public void setPoints(Short points) {
        this.points = points;
    }

    public Short getPoints() {
        return points;
    }

    public Byte getHandicap() {
        return handicap;
    }

    public Short getScore() {
        return score;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Initials: " + this.initials + ", Handicap: " + this.handicap + ", Score: " + this.score + ", Points: " + this.points + ")";
    }

}
