package edu.teamrocket;

public class Stableford implements GolfPlay {

    @Override
    public void scoring(ScoreCard scoreCard) {
        if (scoreCard == null) {
            return;
        }

        updatePlayerPoints(scoreCard.getPlayerA(), scoreCard);
        updatePlayerPoints(scoreCard.getPlayerB(), scoreCard);
        updatePlayerPoints(scoreCard.getPlayerC(), scoreCard);
        updatePlayerPoints(scoreCard.getPlayerD(), scoreCard);
    }

    private void updatePlayerPoints(Player player, ScoreCard scoreCard) {
        if (player == null) {
            return;
        }

        byte[] strokes = scoreCard.getPlayerCourse(player);
        if (strokes == null || strokes.length == 0) {
            player.setPoints((short) 0);
            return;
        }

        short totalPoints = 0;
        int holeCount = Math.min(strokes.length, scoreCard.getHoles().size());

        for (int i = 0; i < holeCount; i++) {
            Byte par = scoreCard.getHoles().get(i).getPar();
            if (par == null) {
                continue;
            }

            int difference = strokes[i] - par;
            totalPoints += getPointsByDifference(difference);
        }

        player.setPoints(totalPoints);
    }

    private int getPointsByDifference(int difference) {
        if (difference <= -3) {
            return StablefordSystem.ALBATROSS.getPoints();
        }
        if (difference == -2) {
            return StablefordSystem.EAGLE.getPoints();
        }
        if (difference == -1) {
            return StablefordSystem.BIRDIE.getPoints();
        }
        if (difference == 0) {
            return StablefordSystem.PAR.getPoints();
        }
        if (difference == 1) {
            return StablefordSystem.BOGEY.getPoints();
        }

        return StablefordSystem.DOUBLE_BOGEY.getPoints();
    }

}
