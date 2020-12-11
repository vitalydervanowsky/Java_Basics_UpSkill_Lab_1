package by.algorithmization.sorting;

// сортировка выбором

public class Task2 {
    public static void main(String[] args) {
        int n = 12;
        int[] a;
        a = create(n);
        show(a);
        sortBySelection(a);
        show(a);
    }

    static void sortBySelection(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            int maxI = i;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[maxI]) {
                    maxI = j;
                }
            }
            int temp = a[i];
            a[i] = a[maxI];
            a[maxI] = temp;
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
