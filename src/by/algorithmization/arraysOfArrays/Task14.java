package by.algorithmization.arraysOfArrays;

// Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
// причем в каждом столбце число единиц равно номеру столбца.

public class Task14 {
    public static void main(String[] args) {
        int n = 10;
        int m = 11;  // n >= m - 1 !!!!!
        int[][] a = new int[n][m];
        int[] ones = new int[m];
        for (int j = 0; j < m; j++) {
            System.out.print("[" + j + "]\t");
            while (ones[j] != j) {
                ones[j] = 0;
                for (int i = 0; i < n; i++) {
                    a[i][j] = (int) (2 * Math.random());
                    if (a[i][j] == 1) {
                        ones[j]++;
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
