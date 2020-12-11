package by.algorithmization.sorting;

// сортировка вставками

public class Task4 {
    public static void main(String[] args) {
        int n = 12;
        int[] a;
        a = create(n);
        show(a);
        sortByInsertion(a);
        show(a);
    }

    static void sortByInsertion(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int element = a[i];
            int j = i;
            while (j > 0 && a[j - 1] > element) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = element;
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
