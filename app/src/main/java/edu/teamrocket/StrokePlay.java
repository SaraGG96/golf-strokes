package edu.teamrocket;

public class StrokePlay implements GolfPlay {

    @Override
    public void scoring(ScoreCard scoreCard) {
        if (scoreCard == null) {
            return;
        }

        for (Player player : scoreCard.getPlayers()) {
            if (player == null) continue;

            byte[] strokes = scoreCard.getPlayerCourse(player);
            if (strokes == null || strokes.length == 0) {
                player.setScore((short) 0);
                continue;
            }

            int total = 0;
            for (byte s : strokes) {
                total += s;
            }

            player.setScore((short) total);
        }
    }

}
