package by.algorithmization.oneDimArrays;

public class Task1 {
    public static void main(String[] args) {
        int n = 8;
        int k = 2;
        int sum = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int)(20 * Math.random());
            System.out.print(a[i] + "\t");
            if (a[i] % k == 0) {
                sum += a[i];
            }
        }
        System.out.println();
        System.out.println("sum = " + sum);
    }
}
