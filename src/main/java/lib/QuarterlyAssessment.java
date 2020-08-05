package main.java.lib;


public class QuarterlyAssessment extends Activity {

    private int score;

    public void setScore(int num) {
        if (score != 0) {
            score = num;
        } else {
            score = randomInt();
        }
    }

    public int getScore() {
        return score;
    }

}