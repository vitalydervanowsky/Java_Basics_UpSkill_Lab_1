package by.algorithmization.sorting;

// сортировка Шелла

public class Task5 {
    public static void main(String[] args) {
        int n = 20;
        int[] a;
        a = create(n);
        show(a);
        sortByShell(a);
        show(a);
    }

    static void sortByShell(int[] a) {
        int d = a.length / 2;
        while (d > 0) {
            for (int i = 0; i < (a.length - d); i++) {
                int j = i;
                while (j >= 0 && a[j] > a[j + d]) {
                    int temp = a[j];
                    a[j] = a[j + d];
                    a[j + d] = temp;
                    j--;
                }
            }
            d = d / 2;
        }
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
