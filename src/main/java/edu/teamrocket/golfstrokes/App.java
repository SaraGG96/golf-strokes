package edu.teamrocket.golfstrokes;

public class App {

    public static void main(String[] args) {
        
        Player player1 = new Player("TR", (byte) 15);
        Player player2 = new Player("JS", (byte) 20);

        Course course = new Course();

        Byte[] strokes1 = {4, 4, 3, 5, 4, 4, 3, 5, 5, 4, 4, 3, 5, 4, 4, 4, 4, 5};
        Byte[] strokes2 = {5, 5, 4, 6, 5, 5, 4, 6, 6, 5, 5, 4, 6, 5, 5, 5, 5, 6};

        course.addPlayerCourse(player1, strokes1);
        course.addPlayerCourse(player2, strokes2);

        ScoreCard scoreCard = new ScoreCard();
        scoreCard.setPlayerA(player1);
        scoreCard.setPlayerB(player2);
        scoreCard.setPlayersCourse(course);

        Stableford stablefordLogic = new Stableford();

        ComputeCard computeCard = new ComputeCard(scoreCard, stablefordLogic);

        computeCard.compute();

        System.out.println("--- RESULTADOS FINALES ---");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
