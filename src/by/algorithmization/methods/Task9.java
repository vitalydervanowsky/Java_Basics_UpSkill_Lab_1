package by.algorithmization.methods;

// Даны числа X, Y, Z, Т — длины сторон четырехугольника.
// Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y — прямой.

public class Task9 {
    public static void main(String[] args) {
        double x = 4;
        double y = 3;
        double z = 7;
        double t = 6;
        System.out.println(square(x, y, z, t));
    }

    public static double square(double x, double y, double z, double t) {
        double s = x * y / 2;
        double c = Math.sqrt(x * x + y * y);
        double p = (c + z + t) / 2;
        s += Math.sqrt(p * (p - c) * (p - z) * (p - t));
        return s;
    }
}
