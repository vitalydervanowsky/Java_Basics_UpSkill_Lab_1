package by.basicDev.linear;

public class Task5 {
    public static void main(String[] args) {
        int t = 4325;
        int hours = t / 60 / 60;
        int seconds = t % 60;
        int minutes = t / 60 - hours * 60;
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "c");
    }
}
