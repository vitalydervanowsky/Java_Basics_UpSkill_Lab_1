package by.classes.simplest.task10;

public class Task10 {
    public static void main(String[] args) {
        AirlineBase ab = new AirlineBase(5);
        ab.show();
        ab.showToDestination("Moscow");
        ab.showAtDay(4);
        ab.showAtDayAndTime(4, 300);
    }
}
