package edu.teamrocket.golfstrokes;

public class Player {

    private String initials;
    private byte handicap;
    private short score;
    private short points;

    public Player(String initials, byte handicap) {
        this.initials = initials;
        this.handicap = handicap;
        this.score = 0; 
        this.points = 0; 
    }


    
    public String getInitials() {
        return initials;
    }

    public byte getHandicap() {
        return handicap;
    }

    public short getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = (short) score;
    }

    public short getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = (short) points;
    }


    
    @Override
    public String toString() {
        return "Player: " + initials + " | Handicap: " + handicap + 
               " | Score: " + score + " | Points: " + points;
    }
}
