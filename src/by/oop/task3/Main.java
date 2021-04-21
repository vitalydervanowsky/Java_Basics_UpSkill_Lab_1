package by.oop.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = createCalendar(2021);
        getHolidays(calendar);
        getWeekends(calendar);
    }

    private static void getHolidays(Calendar calendar) {
        ArrayList<Day> days = calendar.getDays();
        for (int i = 0; i < days.size(); i++) {
            if (days.get(i) instanceof Holiday) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void getWeekends(Calendar calendar) {
        ArrayList<Day> days = calendar.getDays();
        System.out.print("Weekends: ");
        for (int i = 0; i < days.size(); i++) {
            if (days.get(i) instanceof Weekend) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static Calendar createCalendar(int year) {
        Calendar calendar = new Calendar();
        ArrayList<Day> days = new ArrayList<>();
        System.out.print("Holidays: ");
        if (year == 2021) {
            int startDay = 5;
            for (int i = 1; i <= 365; i++) {
                int weekDay = (startDay + i - 1) % 7;
                Day day;
                if (weekDay == 6 || weekDay == 0) {
                    day = new Weekend(weekDay);
                } else {
                    if (i == 1 || i == 256) { // list of holidays
                        day = new Holiday(weekDay);
                    } else {
                        day = new Day(weekDay);
                    }
                }
                days.add(day);
            }
        }
        calendar.setDays(days);
        return calendar;
    }
}
