package edu.teamrocket;

public class Player {

    private String initials;
    private Byte handicap;
    private Short score;
    private Short points;

    public Player(String initials, Byte handicap) {
        this.initials = initials;
        this.handicap = handicap;
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

}
