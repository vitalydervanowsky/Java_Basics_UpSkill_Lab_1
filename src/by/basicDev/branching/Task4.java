package by.basicDev.branching;

// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
// Определить, пройдет ли кирпич через отверстие.

public class Task4 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int x = 110;
        int y = 20;
        int z = 70;
        boolean isOk = (a >= x && b >= y) || (a >= x && b >= z) ||
                (a >= y && b >= x) || (a >= y && b >= z) ||
                (a >= z && b >= x) || (a >= z && b >= y);
        System.out.println(isOk);
    }
}
