package edu.teamrocket;

public enum StablefordSystem {

    DOUBLE_BOGEY(-3),
    BOGEY(-1),
    PAR(0),
    BIRDIE(2),
    EAGLE(5),
    ALBATROSS(8);

    private final int points;

    StablefordSystem(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

}
