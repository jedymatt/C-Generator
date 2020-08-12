package main.java.lib;

//model
import java.util.Properties;
import java.io.File;
import java.util.Arrays;
import java.util.Random;
import main.java.util.FileList;

public class ClassRecord {

    private StudentActivity[] activities;
    private Random random;
    private File fileAverage;
    private File fileWritten;
    private File filePerformance;
    private File fileQuarterly;

    public ClassRecord() {
        activities = null;
        random = new Random();
        fileAverage = null;
        fileWritten = null;
        filePerformance = null;
        fileQuarterly = null;
    }

    public void setFileAverage(File f) {
        fileAverage = f;
    }

    public void setFileWritten(File f) {
        fileWritten = f;
    }

    public void setFilePerformance(File f) {
        filePerformance = f;
    }

    public void setFileQuarterly(File f) {
        fileQuarterly = f;
    }

    public File getFileAverage() {
        return fileAverage;
    }

    public File getFileWritten() {
        return fileWritten;
    }

    public File getFilePerformance() {
        return filePerformance;
    }

    public File getFileQuarterly() {
        return fileQuarterly;
    }

    public int[] intArrayRandom(int[] oldValue, int[] newValue, int min, int max) {
        int[] value = oldValue.clone();
        // Assumes oldValue array is initialized
        if (newValue != null) {
            for (int i = 0; i < value.length; i++) {
                try {
                    if (newValue[i] == 0) {
                        value[i] = random.nextInt((max - min) + 1) + min;
                    } else {
                        value[i] = newValue[i];
                    }
                } catch (IndexOutOfBoundsException ex) {
                    value[i] = random.nextInt((max - min) + 1) + min;
                }
            }

        } else {
            for (int i = 0; i < value.length; i++) {
                value[i] = random.nextInt((max - min) + 1) + min;
            }
        }
        return value;
    }

    public int[] toIntArray(String str) {

        String[] array = str.split(" ");
        int[] value = new int[array.length];
        for (int i = 0; i < value.length; i++) {
            value[i] = Integer.parseInt(array[i]);
        }

        return value;
    }

    public int intRandom(int newValue, int min, int max) {
        if (newValue != 0 && newValue != -1) {
            return newValue;
        } else {
            return random.nextInt((max - min) + 1) + min;
        }
    }

    public double calculate(int sum, int max, double percent) {
        double value = (sum / (max / 100.0)) * percent;
        return value;
    }

    public int sumArray(int[] array) {
        int value = 0;

        for (int i : array) {
            value += i;
        }
        return value;
    }

    private double getPercent(int i) {
        switch (i) {
            case 0:
                return 0.20;
            case 1:
                return 0.30;
            case 2:
                return 0.40;
            case 3:
                return 0.50;
            case 4:
                return 0.60;
            default:
                throw new AssertionError();
        }
    }

    public int propertyInt(Properties p, String str) {
        return Integer.parseInt(p.getProperty(str));
    }

    public void initialize() {

    }

    public void generate(Properties p) {
        //Initialize
        activities = new StudentActivity[FileList.intArray(fileAverage).length];
        int lengthWritten = Integer.parseInt(p.getProperty("written.size"));
        int lengthPerformance = Integer.parseInt(p.getProperty("performance.size"));
        for (int i = 0; i < activities.length; i++) {
            int averageGrade = FileList.intArray(fileAverage)[i];
            activities[i] = new StudentActivity(lengthWritten, lengthPerformance, averageGrade);
        }
        int minWritten = Integer.parseInt(p.getProperty("written.range.min"));
        int maxWritten = Integer.parseInt(p.getProperty("written.range.max"));
        int minPerformance = Integer.parseInt(p.getProperty("performance.range.min"));
        int maxPerformance = Integer.parseInt(p.getProperty("performance.range.max"));
        int minQuarterly = Integer.parseInt(p.getProperty("quarterly.range.min"));
        int maxQuarterly = Integer.parseInt(p.getProperty("quarterly.range.max"));
        double percentWritten = getPercent(Integer.parseInt(p.getProperty("written.percent")));
        double percentPerformance = getPercent(Integer.parseInt(p.getProperty("performance.percent")));
        double percentQuarterly = getPercent(Integer.parseInt(p.getProperty("quarterly.percent")));

        for (int i = 0; i < activities.length; i++) {
            double rawAverage;
            double minInitial = TransmutedGrade.average(activities[i].getAverageGrade()).MIN_INITIAL;
            double maxInitial = TransmutedGrade.average(activities[i].getAverageGrade()).MAX_INITIAL;

            int[] tempWritten;
            int[] tempPerformance;
            int tempQuarterly = 0;
            do {
                rawAverage = 0;
                if (fileWritten != null) {
                    tempWritten = intArrayRandom(activities[i].getWrittenWorks(),
                            toIntArray(FileList.stringArray(fileWritten)[i]),
                            minWritten, maxWritten);
                } else {
                    tempWritten = intArrayRandom(activities[i].getWrittenWorks(),
                            null, minWritten, maxWritten);
                }

                if (filePerformance != null) {
                    tempPerformance = intArrayRandom(activities[i].getPerformanceTasks(),
                            toIntArray(FileList.stringArray(filePerformance)[i]),
                            minPerformance, maxPerformance);
                } else {
                    tempPerformance = intArrayRandom(activities[i].getPerformanceTasks(),
                            null, minPerformance, maxPerformance);
                }

                if (fileQuarterly != null) {
                    tempQuarterly = intRandom(FileList.intArray(fileQuarterly)[i],
                            minQuarterly, maxQuarterly);
                } else {
                    tempQuarterly = intRandom(-1, minQuarterly, maxQuarterly);
                }

                rawAverage += calculate(sumArray(tempWritten), tempWritten.length * maxWritten, percentWritten);
                rawAverage += calculate(sumArray(tempPerformance), tempPerformance.length * maxPerformance, percentPerformance);
                rawAverage += calculate(tempQuarterly, maxQuarterly, percentQuarterly);
                System.out.println("proccessing... raw average=" + rawAverage);
            } while (rawAverage < minInitial || rawAverage > maxInitial);
            System.out.println("Random data obtained...");
            activities[i].setWrittenWorks(tempWritten);
            activities[i].setPerformanceTasks(tempPerformance);
            activities[i].setQuarterlyAssessment(tempQuarterly);
            System.out.println(Arrays.toString(activities[i].getWrittenWorks()));
            System.out.println(Arrays.toString(activities[i].getPerformanceTasks()));
            System.out.println(activities[i].getQuarterlyAssessment());
        }

    }

    public String stringArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < arr.length; j++) {
            sb.append(arr[j]);
            if (j < arr.length - 1) {
                sb.append("\t");
            }
        }
        return sb.toString();
    }

    public String studentsWrittenRecord() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < activities.length; i++) {
            sb.append(stringArray(activities[i].getWrittenWorks()));
            if (i < activities.length - 1) {
                sb.append(System.getProperty("line.separator"));
            }
        }
        return sb.toString();
    }

    public String studentsPerformanceRecord() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < activities.length; i++) {
            sb.append(stringArray(activities[i].getPerformanceTasks()));
            if (i < activities.length - 1) {
                sb.append(System.getProperty("line.separator"));
            }
        }
        return sb.toString();
    }

    public String studentsQuarterlyRecord() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < activities.length; i++) {
            sb.append(activities[i].getQuarterlyAssessment());
            if (i < activities.length - 1) {
                sb.append(System.getProperty("line.separator"));
            }
        }
        return sb.toString();
    }

}
