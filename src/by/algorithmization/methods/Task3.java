package by.algorithmization.methods;

public class Task3 {
    public static void main(String[] args) {
        double a = 3;
        double s = 6 * squareTriangle(a);
        System.out.println(squareTriangle(a));
        System.out.println(s);
    }

    static double squareTriangle(double a) {
        return a * a * Math.sqrt(a) / 4;
    }
}
