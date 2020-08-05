
public class Activities {

    private int[] writtenworks;
    private int[] performancetasks;
    private int quarterlyassessment;

    public Activities(int wwLength, int ptLength) {
        writtenworks = new int[wwLength];
        performancetasks = new int[ptLength];
        quarterlyassessment = -1;
    }

    public void setWrittenworks(int[] writtenworks) {
        this.writtenworks = writtenworks;
    }

    public void setPerformancetasks(int[] performancetasks) {
        this.performancetasks = performancetasks;
    }

    public void setQuarterlyassessment(int quarterlyassessment) {
        this.quarterlyassessment = quarterlyassessment;
    }

    public int[] getWrittenworks() {
        return writtenworks;
    }

    public int[] getPerformancetasks() {
        return performancetasks;
    }

    public int getQuarterlyassessment() {
        return quarterlyassessment;
    }
    
    
}
