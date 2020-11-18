package by.basicDev.branching;

// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
// Определить, будут ли они расположены на одной прямой.

public class Task3 {
    public static void main(String[] args) {
        double ax = 1;
        double ay = 2;
        double bx = 2;
        double by = 4;
        double cx = 3;
        double cy = 6;
        double result1 = (bx - ax) / (by - ay);
        double result2 = (cx - ax) / (cy - ay);
        double result3 = (cx - bx) / (cy - by);
        boolean result = (result1 == result2) && (result1 == result3);
        System.out.println(result);
    }
}
