package by.basicDev.branching;

public class Task5 {
    public static void main(String[] args) {
        double x = Math.random() * 10;
        double y;
        if (x <= 3) {
            y = x * x - 3 * x + 9;
        } else {
            y = 1 / (x * x * x + 6);
        }
        System.out.println("x=" + x + ", y=" + y);
    }
}
