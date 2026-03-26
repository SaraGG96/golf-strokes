package edu.teamrocket.golfstrokes;
import java.util.List;

public class Stableford implements GolfPlay {

    @Override
    public void scoring(ScoreCard scoreCard) {
        List<Player> players = scoreCard.getPlayers();

        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            Byte[] strokes = scoreCard.getPlayerCourse(player);
            
            if (strokes != null) {
                int totalStrokes = 0;
                for (int j = 0; j < strokes.length; j++) {
                    totalStrokes = totalStrokes + strokes[j];
                }
                player.setScore(totalStrokes);
            }
        }
    }
    
}