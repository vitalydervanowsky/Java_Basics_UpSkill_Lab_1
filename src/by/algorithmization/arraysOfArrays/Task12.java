package by.algorithmization.arraysOfArrays;

public class Task12 {
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

        System.out.println("============По=возрастанию=============");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m - 1; k++) {
                    if (a[i][k] > a[i][j]) {
                        int temp = a[i][k];
                        a[i][k] = a[i][j];
                        a[i][j] = temp;
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

        System.out.println("=============По=убыванию===============");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j += 2) {
                int temp = a[i][j];
                a[i][j] = a[i][m - j - 1];
                a[i][m - j - 1] = temp;
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
