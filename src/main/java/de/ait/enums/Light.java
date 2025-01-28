package de.ait.enums;

public enum Light {

    RED (30),// горит 30 секунд
    YELLOW (10),
    GREEN (45);

    private int duration;

    Light(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
