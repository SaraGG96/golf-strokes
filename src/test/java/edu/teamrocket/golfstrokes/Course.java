package edu.teamrocket.golfstrokes;

import java.util.HashMap;
import java.util.Map;

public class Course {

    private Map<Player, Byte[]> playersCourse;

    public Course() {
        this.playersCourse = new HashMap<>();
    }

    public void addPlayerCourse(Player player, Byte[] strokes) {
        playersCourse.put(player, strokes);
    }

    public Byte[] getPlayerCourse(Player player) {
        return playersCourse.get(player);
    }
}
