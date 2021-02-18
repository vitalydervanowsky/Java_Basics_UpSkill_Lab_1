package by.classes.simplest.task10;

public class Time {
    private int time;

    public Time(int time) {
        this.time = time;
    }

    public int [] toHoursAndMinutes() {
        int [] time = new int[2];
        time[0] = this.time / 60; // hours
        time[1] = this.time % 60; // minutes
        return time;
    }

    public String toString() {
        int [] t = toHoursAndMinutes();
        String h;
        String m;
        if (t[0] < 10) {
            h = "0" + t[0];
        } else {
            h = "" + t[0];
        }
        if (t[1] < 10) {
            m = ":0" + t[1];
        } else {
            m = ":" + t[1];
        }
        return h + m;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
