package by.algorithmization.methods;

public class Task1 {
    public static void main(String[] args) {
        int a = 50;
        int b = 180;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("НОД = " + nod(a, b));
        System.out.println("НОK = " + nok(a, b));
    }

    static int nod(int a, int b) {
        int result = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return result;
    }

    static int nok(int a, int b) {
        return (a * b) / nod(a, b);
    }
}
