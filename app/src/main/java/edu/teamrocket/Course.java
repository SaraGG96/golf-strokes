package edu.teamrocket;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.primitives.Bytes;

public class Course {

    private final Table<String, Byte, Byte> playersCourse = HashBasedTable.create();

    public Course() {}

    public void addPlayerCourse(Player playerA, Byte[] coursePlayerA) {
        for (byte hole = 1; hole <= coursePlayerA.length; hole++) {
            playersCourse.put(playerA.getInitials(), hole, coursePlayerA[hole - 1]);
        }
    }

    
}
