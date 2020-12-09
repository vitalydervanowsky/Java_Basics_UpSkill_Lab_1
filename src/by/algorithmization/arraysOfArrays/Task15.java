package by.algorithmization.arraysOfArrays;

// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task15 {
    public static void main(String[] args) {
        int n = 4;
        int m = 10;
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (100 * Math.random());
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        int max = a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("max=" + max);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] % 2 == 1) {
                    a[i][j] = max;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
