package main.lib;

public class WrittenWorks extends Activity {

    private int[] scores;

    public WrittenWorks() {
        //Initialize scores
        scores = null;
    }

    public void setScores(int[] scoreArray) {
        if (scoreArray != null) {
            for (int i = 0; i < scores.length; i++) {
                try {
                    if (scoreArray[i] == 0) {
                        scores[i] = randomInt();
                    } else {
                        scores[i] = scoreArray[i];
                    }
                } catch (IndexOutOfBoundsException ex) {
                    scores[i] = randomInt();
                }
            }
        } else {
            for (int i = 0; i < scores.length; i++) {
                scores[i] = randomInt();
            }
        }
    }

    public int[] getScores() {
        return scores;
    }
}
