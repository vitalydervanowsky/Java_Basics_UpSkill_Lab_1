package by.algorithmization.methods;

// Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
// элементами которого являются числа, сумма цифр которых равна К
// и которые не большее N.

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int k = 19;
        int n = 5;
        int [] a;
        a = create(k, n);
        show(a);
    }

    static int [] create(int k, int n) {
        int [] a = new int[k];
        int c = 0;
        while (sum(a) != k){
            if (c == k) {
                c = 0;
                Arrays.fill(a, 0);
            }
            a[c] = (int) (Math.random() * (n + 1));
            if (sum(a) <= k && a[c] != 0) {
                c++;
            }
        }
        int counter = 0;
        int [] b = new int[c];
        for (int j : a) {
            if (j > 0) {
                b[counter] = j;
                counter++;
            }
        }
        return b;
    }

    static int sum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    static void show(int[] array) {
        for (int j : array) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }
}
