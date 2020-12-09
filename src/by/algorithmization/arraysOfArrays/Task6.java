package by.algorithmization.arraysOfArrays;

public class Task6 {
    public static void main(String[] args) {
        int n = 10;
        if (n % 2 == 0) {
            int[][] a = new int[n][n];
            for (int i = 0; i < n / 2; i++) {
                for (int j = i; j < n - i; j++) {
                    a[i][j] = 1;
                }
            }
            for (int i = n / 2; i < n; i++) {
                for (int j = n-i-1; j <= i; j++) {
                    a[i][j] = 1;
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
