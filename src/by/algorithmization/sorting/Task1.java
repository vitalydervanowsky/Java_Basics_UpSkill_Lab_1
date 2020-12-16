package by.algorithmization.sorting;

// Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1)-м элементами первого,
// при этом не используя дополнительный массив.

public class Task1 {
    public static void main(String[] args) {
        int n = 20;
        int m = 4;
        int k = 7;
        int[] a;
        int[] b;
        a = create(n);
        b = create(m);
        show(a);
        show(b);
        for (int i = 0; i < k; i++) {
            System.out.print("\t");
        }
        System.out.println("**");
        merge(a, b, k);
        show(a);
    }

    static void merge(int[] a, int[] b, int k){
        int delta = a.length - b.length - k;
        if (delta > 0) {
            System.arraycopy(a, k, a, k + b.length, delta);
            delta = 0;
        }
        if (b.length + delta >= 0) System.arraycopy(b, 0, a, k, b.length + delta);
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
