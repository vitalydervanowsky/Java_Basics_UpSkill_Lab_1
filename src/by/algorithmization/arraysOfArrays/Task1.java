package by.algorithmization.arraysOfArrays;

public class Task1 {
    public static void main(String[] args) {
        int n = 8;
        int m = 10;
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (100 * Math.random());
                System.out.print("a[" + i + "][" + j + "]=" + a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("################################################################");
        for (int i = 0; i < n; i+=2) {
            if (a[i][0] > a[i][m-1]) {
                for (int j = 0; j < m; j++) {
                    System.out.print("a[" + i + "][" + j + "]=" + a[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
