package by.algorithmization.oneDimArrays;

public class Task10 {
    public static void main(String[] args) {
        int n = 8;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (20 * Math.random());
            System.out.print("a[" + i + "]=" + a[i] + "\t");
        }
        System.out.println();
        int[] b = new int[n];
        int counter = 0;
        for (int i = 0; i < n; i+=2) {
            b[i - counter] = a[i];
            counter++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("b[" + i + "]=" + b[i] + "\t");
        }
    }
}
