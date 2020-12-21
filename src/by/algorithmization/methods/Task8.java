package by.algorithmization.methods;

public class Task8 {
    public static void main(String[] args) {
        int n = 10;
        int[] a;
        a = create(n);
        show(a);
        System.out.print("\t");
        for (int i = 1; i < a.length - 1; i++) {
            System.out.print(sumOf3(a, i) + "\t");
        }
    }

    static int sumOf3(int[] a, int n) {
        int sum = 0;
        if (n >= 0 && n < a.length - 1) {
            sum = a[n - 1] + a[n] + a[n + 1];
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
