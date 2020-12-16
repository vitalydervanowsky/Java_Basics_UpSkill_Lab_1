package by.algorithmization.methods;

public class Task2 {
    public static void main(String[] args) {
        int a = 360;
        int b = 160;
        int c = 80;
        int d = 520;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        System.out.println("НОД = " + nod(a, b, c, d));
    }

    static int nod(int a, int b, int c, int d) {
        int result = 1;
        int min = Math.min(a, b);
        min = Math.min(c, min);
        min = Math.min(d, min);
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                result = i;
            }
        }
        return result;
    }
}
