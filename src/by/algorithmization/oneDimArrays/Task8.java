package by.algorithmization.oneDimArrays;

public class Task8 {
    public static void main(String[] args) {
        int n = 8;
        int[] a = new int[n];
        int minI = 0;
        int counterMin = 0;
        for (int i = 0; i < n; i++) {
            a[i] = (int) (20 * Math.random());
            System.out.print("a[" + i + "]=" + a[i] + "\t");
            if (a[i] < a[minI]) {
                minI = i;
            }
        }
        System.out.println();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            if (a[i] != a[minI]) {
                b[i - counterMin] = a[i];
            } else {
                counterMin++;
            }
        }
        for (int i = 0; i < n - counterMin; i++) {
            System.out.print("b[" + i + "]=" + b[i] + "\t");
        }
    }
}
