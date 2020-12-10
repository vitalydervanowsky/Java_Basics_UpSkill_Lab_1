package by.algorithmization.arraysOfArrays;

public class Task3 {
    public static void main(String[] args) {
        int n = 8;
        int m = 8;
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (100 * Math.random());
                System.out.print("a[" + i + "][" + j + "]=" + a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("################################################################");
        int k = 3;
        int p = 5;
        System.out.println("Строка " + k + ":");
        for (int j = 0; j < m; j++) {
            System.out.print("a[" + k + "][" + j + "]=" + a[k][j] + "\t");
        }
        System.out.println();
        System.out.println("Столбец " + p + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "][" + p + "]=" + a[i][p] + "\t");
        }
    }
}
