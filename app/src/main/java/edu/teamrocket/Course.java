package edu.teamrocket;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.primitives.Bytes;

public class Course {

    private final Table<String, Byte, Byte> playersCourse = HashBasedTable.create();

    public Course() {}

    
}
