package by.algorithmization.oneDimArrays;

public class Task6 {
    public static void main(String[] args) {
        int n = 5;
        double[] a = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = 20 * Math.random();
            System.out.println("a[" + i + "]=" + a[i]);
        }
        // в решении задачи я принял, что последовательность начинается с единицы:
        // элемент массива a[0] - первый элемент последовательности
        // a[n-1] - n-й или последний элемент последовательности
        for (int i = 2; i <= n; i++) {
            if (checkSimple(i)) {
                System.out.println(i);
                sum += a[i - 1];
            }
        }
        System.out.println("sum = " + sum);
    }

    public static boolean checkSimple(int i) {
        if (i <= 1) {
            return false;
        } else {
            if (i <= 3) {
                return true;
            } else {
                if (i % 2 == 0 || i % 3 == 0) {
                    return false;
                }
            }
        }
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0) {
                return false;
            }
            n = n + 6;
        }
        return true;
    }
}
