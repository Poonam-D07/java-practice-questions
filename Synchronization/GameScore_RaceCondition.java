
class GameScore {

    int score = 0;

    void addScore(int points) {

        // Read current score.
        int currentScore = score;

        // Simulate some processing time.
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Write new score.
        score = currentScore + points;
    }
}

public class GameScore_RaceCondition {

    public static void main(String[] args) {

        // SAME score object shared by both threads.
        GameScore game = new GameScore();

        Thread t1 = new Thread(() -> {

            // Thread-1 adds 100 points.
            game.addScore(100);

        }, "Player-Thread-1");

        Thread t2 = new Thread(() -> {

            // Thread-2 adds 200 points.
            game.addScore(200);

        }, "Player-Thread-2");

        t1.start();
        t2.start();

        try {

            t1.join();
            t2.join();

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        // Expected:
        // 100 + 200 = 300
        System.out.println("Final Score = " + game.score);
    }
}