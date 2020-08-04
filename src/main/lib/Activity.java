package main.lib;

public class Activity {

    private int min;
    private int max;

    protected Activity() {
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    protected int randomInt() {
        return new java.util.Random().nextInt((max - min) + 1) + min;
    }

}
