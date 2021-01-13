package by.algorithmization.methods;

public class Task8 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        int m = 5;
        int[] a;
        a = create(n);
        show(a);
        System.out.println(sum(a, k, m));
    }

    static int sum(int [] a, int first, int last) {
        int result = 0;
        for (int i = first; i <= last; i++) {
            result += sumOf3(a, i);
        }
        return result;
    }

    static int sumOf3(int[] a, int n) {
        int sum = 0;
        if (n >= 0 && n < a.length - 1) {
            sum = a[n] + a[n + 1] + a[n + 2];
        }
        return sum;
    }

    static int [] create(int n) {
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(100 * Math.random());
        }
        return a;
    }

    static void show(int[] a) {
        for (int j : a) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }
}
