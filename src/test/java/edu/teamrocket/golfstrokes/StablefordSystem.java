package edu.teamrocket.golfstrokes;

public enum StablefordSystem {

    ALBATROSS(5),
    EAGLE(4),
    BIRDIE(3),
    PAR(2),
    BOGEY(1),
    DOUBLE_BOGEY(0);

    private int points;

    StablefordSystem(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
