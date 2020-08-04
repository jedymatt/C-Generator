package main.lib;

public class StudentRecord {

    private WrittenWorks writtenWorks;
    private PerformanceTasks performanceTasks;
    private QuarterlyAssessment quarterlyAssessment;
    private double initialMin;
    private double initialMax;

    public StudentRecord(int average, double initialMin, double initialMax) {
        writtenWorks = new WrittenWorks();
        performanceTasks = new PerformanceTasks();
        quarterlyAssessment = new QuarterlyAssessment();
        this.initialMin = initialMin;
        this.initialMax = initialMax;
    }

    public StudentRecord(int average) {
        this(average, 0, 0);
    }

    public void setInitials(int average) {
        initialMin = TransmutationTable.caseAverage(average).MIN_INITIAL;
        initialMax = TransmutationTable.caseAverage(average).MAX_INITIAL;
    }

    public void setScoresWrittenWorks(int[] scoreArray) {
        writtenWorks.setScores(scoreArray);
    }

    public void setScoresPerformanceTasks(int[] scoreArray) {
        performanceTasks.setScores(scoreArray);
    }

    public void setScoreQuarterlyAssessment(int score) {
        quarterlyAssessment.setScore(score);
    }

    public int[] getScoresWrittenWorks() {
        return writtenWorks.getScores();
    }

}
