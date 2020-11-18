package by.basicDev.branching;

// Найти max{min(a, b), min(c, d)}.

public class Task2 {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 100);
        System.out.println("a=" + a);
        int b = (int)(Math.random() * 100);
        System.out.println("b=" + b);
        int c = (int)(Math.random() * 100);
        System.out.println("c=" + c);
        int d = (int)(Math.random() * 100);
        System.out.println("d=" + d);
        int min1 = (a < b) ? a : b;
        int min2 = (c < d) ? c : d;
        int result = (min1 > min2) ? min1 : min2;
        System.out.println(result);
    }
}
