package main.java.lib;

public class StudentActivity {

    private int averageGrade;
    private int[] writtenWorks;
    private int[] performanceTasks;
    private int quarterlyAssessment;

    public StudentActivity(int lengthWritten, int lengthPerformance, int averageGrade) {
        this.averageGrade = averageGrade;
        writtenWorks = new int[lengthWritten];
        performanceTasks = new int[lengthPerformance];
        quarterlyAssessment = 0;
    }

    public void setAverageGrade(int averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void setWrittenWorks(int[] writtenWorks) {
        this.writtenWorks = writtenWorks;
    }

    public void setPerformanceTasks(int[] performanceTasks) {
        this.performanceTasks = performanceTasks;
    }

    public void setQuarterlyAssessment(int quarterlyAssessment) {
        this.quarterlyAssessment = quarterlyAssessment;
    }

    public int getAverageGrade() {
        return averageGrade;
    }

    public int[] getWrittenWorks() {
        return writtenWorks;
    }

    public int[] getPerformanceTasks() {
        return performanceTasks;
    }

    public int getQuarterlyAssessment() {
        return quarterlyAssessment;
    }

}
