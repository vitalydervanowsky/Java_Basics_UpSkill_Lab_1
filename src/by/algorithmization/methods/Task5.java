package by.algorithmization.methods;

public class Task5 {
    public static void main(String[] args) {
        int n = 20;
        int[] a;
        a = create(n);
        show(a);
        System.out.println("max number is " + a[findMax(a)]);
        System.out.println("premax number is " + a[findPremax(a)]);
    }

    static int findPremax(int[] a) {
        int premax = 0;
        int max = findMax(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[premax] && a[i] != a[max]) {
                premax = i;
            }
        }
        return premax;
    }

    static int findMax(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[max]) {
                max = i;
            }
        }
        return max;
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
