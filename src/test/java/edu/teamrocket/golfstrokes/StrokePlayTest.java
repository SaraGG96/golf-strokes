package edu.teamrocket.golfstrokes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StrokePlayTest {
    
    private ScoreCard scoreCard;
    private Course course;
    private StrokePlay strokePlay;
    private Player playerA;
    private Player playerB;

    @BeforeEach
    void setUp() {
        scoreCard = new ScoreCard();
        course = new Course();
        strokePlay = new StrokePlay();
        
        playerA = new Player("PA", (byte)5);
        playerB = new Player("PB", (byte)10);
        
        scoreCard.setPlayerA(playerA);
        scoreCard.setPlayerB(playerB);
        
        Byte[] coursePlayerA = {
            4, 4, 3, 4, 4, 4, 3, 4, 5,  // Out nine: 35
            4, 4, 3, 4, 4, 4, 4, 4, 5   // In nine: 36
        }; // Total: 71
        
        Byte[] coursePlayerB = {
            4, 4, 4, 4, 4, 4, 3, 4, 5,  // Out nine: 36
            4, 4, 4, 4, 4, 4, 4, 4, 5   // In nine: 37
        };
        
        course.addPlayerCourse(playerA, coursePlayerA);
        course.addPlayerCourse(playerB, coursePlayerB);
        
        scoreCard.setPlayersCourse(course);
    }

    @Test
    void testScoring() {
        strokePlay.scoring(scoreCard);
        assertEquals((short) 71, playerA.getScore());
        assertEquals((short) 73, playerB.getScore());
    }
} 