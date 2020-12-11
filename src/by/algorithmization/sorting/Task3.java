package by.algorithmization.sorting;

// сортировка обменами

public class Task3 {
    public static void main(String[] args) {
        int n = 12;
        int[] a;
        a = create(n);
        show(a);
        sortByBubble(a);
        show(a);
    }

    static void sortByBubble(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
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
