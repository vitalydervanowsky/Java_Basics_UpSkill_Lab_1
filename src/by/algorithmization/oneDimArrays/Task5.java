package by.algorithmization.oneDimArrays;

public class Task5 {
    public static void main(String[] args) {
        int n = 20;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int)(20 * Math.random());
            System.out.print("a[" + i + "]=" + a[i] + "\t");
        }
        System.out.println();
        System.out.print("Condition (a[i] > i) is true for: ");
        for (int i = 0; i < n; i++) {
            if (a[i] > i) {
                System.out.print("a[" + i + "]=" + a[i] + "\t");
            }
        }
        System.out.println();
    }
}
