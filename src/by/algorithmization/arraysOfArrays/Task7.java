package by.algorithmization.arraysOfArrays;

public class Task7 {
    public static void main(String[] args) {
        int n = 3;
        double[][] a = new double[n][n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.sin((double) (i * i - j * j) / n);
                if (a[i][j] > 0) {
                    sum += a[i][j];
                }
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("sum=" + sum);
    }
}
