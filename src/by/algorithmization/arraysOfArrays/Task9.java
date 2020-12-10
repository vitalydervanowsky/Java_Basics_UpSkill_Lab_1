package by.algorithmization.arraysOfArrays;

public class Task9 {
    public static void main(String[] args) {
        int n = 2;
        int m = 10;
        int[][] a = new int[n][m];
        int[] sumOfRow = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (100 * Math.random());
                System.out.print("a[" + i + "][" + j + "]=" + a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("======================================================================================================================");
        int maxSum = 0;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                sumOfRow[j] += a[i][j];
            }
            if (sumOfRow[j] > maxSum) {
                maxSum = sumOfRow[j];
            }
            System.out.print("sum[" + j + "]=" + sumOfRow[j] + "\t");
        }
        System.out.println();
        System.out.println("Максимальная сумма = " + maxSum);
    }
}
