package by.algorithmization.arraysOfArrays;

public class Task5 {
    public static void main(String[] args) {
        int n = 8;
        if (n % 2 == 0) {
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    a[i][j] = i + 1;
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
