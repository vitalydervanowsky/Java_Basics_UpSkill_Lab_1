package by.algorithmization.arraysOfArrays;

public class Task4 {
    public static void main(String[] args) {
        int n = 16;
        if (n % 2 == 0) {
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i += 2) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = j + 1;
                    a[i + 1][j] = n - j;
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("n должно быть четным!");
        }
    }
}
