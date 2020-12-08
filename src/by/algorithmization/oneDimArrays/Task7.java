package by.algorithmization.oneDimArrays;

public class Task7 {
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[2 * n];
        for (int i = 0; i < n; i++) {
            a[i] = (int)(20 * Math.random());
            System.out.print("a[" + i + "]=" + a[i] + "\t");
            int b = i + n;
            a[b] = (int)(20 * Math.random());
            System.out.println("a[" + b + "]=" + a[b] + "\t");
        }
        int max = a[0] + a[2 * n - 1];
        for (int i = 1; i < n; i++) {
            int sum = a[i] + a[2 * n - 1 - i];
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println("max sum is " + max);
    }
}
