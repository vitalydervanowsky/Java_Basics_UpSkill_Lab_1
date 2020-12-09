package by.algorithmization.arraysOfArrays;

public class Task2 {
    public static void main(String[] args) {
        int n = 6;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int)(20 * Math.random());
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("################################################");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i][i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(a[i][n - 1 - i] + "\t");
        }
    }
}
