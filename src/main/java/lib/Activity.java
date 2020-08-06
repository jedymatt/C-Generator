package main.java.lib;

import java.util.Random;

public class Activity {

    private final Random random;
    private int[] writtenWorks;
    private int[] performanceTasks;
    private int quarterlyAssessment;

    public Activity() {
        random = new Random();
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

    public int[] getWrittenWorks() {
        return writtenWorks;
    }

    public int[] getPerformanceTasks() {
        return performanceTasks;
    }

    public int getQuarterlyAssessment() {
        return quarterlyAssessment;
    }

    public void setArrayRandomValues(int[] oldValue, int[] newValue, int min, int max) {
        // Assumes oldValue array is initialized
        if (newValue != null) {
            for (int i = 0; i < oldValue.length; i++) {
                try {
                    if (newValue[i] == 0) {
                        oldValue[i] = random.nextInt((max - min) + 1) + min;
                    } else {
                        oldValue[i] = newValue[i];
                    }
                } catch (IndexOutOfBoundsException ex) {
                    oldValue[i] = random.nextInt((max - min) + 1) + min;
                }
            }

        } else {
            for (int i = 0; i < oldValue.length; i++) {
                oldValue[i] = random.nextInt((max - min) + 1) + min;
            }
        }
    }

    public void setQuarterlyAssessmentRandomValue(int newValue, int min, int max) {
        if (quarterlyAssessment != 0) {
            quarterlyAssessment = newValue;
        } else {
            quarterlyAssessment = random.nextInt((max - min) + 1) + min;
        }
    }

}
