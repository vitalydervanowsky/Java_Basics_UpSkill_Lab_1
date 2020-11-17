package by.basicDev.linear;

public class Task2 {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 4.5;
        double c = 999;
        double result;
        result = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + Math.pow(b, -2);
        System.out.println(result);
    }
}
