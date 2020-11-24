package by.basicDev.cycles;

public class Task2 {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 3.0;
        double h = 0.2;
        double x = a;
        double y;
        int quantity = (int) ((b - a) / h);
        System.out.println(quantity);
        for (int i = 0; i < quantity; i++) {
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println("x=" + x + ", y=" + y);
            x += h;
        }
    }
}
