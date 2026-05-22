package edu.teamrocket;
import java.util.Map;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Course {

    private final Table<String, Byte, Byte> playersCourse = HashBasedTable.create();

    public Course() {}

    public void addPlayerCourse(Player player, Byte[] course) {
        for (byte hole = 1; hole <= course.length; hole++) {
            playersCourse.put(player.getInitials(), hole, course[hole - 1]);
        }
    }

    public byte[] getPlayerCourse(Player player) {
        if (player == null || !playersCourse.containsRow(player.getInitials())) {
            return new byte[0];
        }

        Map<Byte, Byte> holeScores = playersCourse.row(player.getInitials());
        byte[] course = new byte[holeScores.size()];

        for (byte hole = 1; hole <= holeScores.size(); hole++) {
            course[hole - 1] = holeScores.getOrDefault(hole, (byte) 0);
        }

        return course;
    }
    
}
