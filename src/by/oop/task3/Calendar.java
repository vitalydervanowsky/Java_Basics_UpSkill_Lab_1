package by.oop.task3;

import java.util.ArrayList;

public class Calendar {
    private final ArrayList<Day> days;

    public Calendar(ArrayList<Day> days) {
        this.days = days;
    }

    public ArrayList<Day> getDays() {
        return days;
    }
}
