package by.algorithmization.arraysOfArrays;

// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Task13 {
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

        System.out.println("============По=возрастанию============");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < n - 1; k++) {
                    if (a[i][j] < a[k][j]) {
                        int temp = a[i][j];
                        a[i][j] = a[k][j];
                        a[k][j] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("=============По=убыванию==============");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i += 2) {
                int temp = a[i][j];
                a[i][j] = a[n - i - 1][j];
                a[n - i - 1][j] = temp;
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
