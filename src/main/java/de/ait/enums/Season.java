package de.ait.enums;

public enum Season {
    WINTER (-20,-10,-30),
    SPRING (0,5,-5),
    SUMMER (20,30,10),
    FALL (10,20,-10);


    private int averageatemperature;
    private  int max;
    private  int min;

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }


    public int getAverageatemperature() {
        return averageatemperature;
    }

    Season(int averageatemperature, int max, int min) {
        this.averageatemperature = averageatemperature;
        this.max = max;
        this.min = min;
    }
}
