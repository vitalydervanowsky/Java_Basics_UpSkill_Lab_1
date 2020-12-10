package by.algorithmization.arraysOfArrays;

public class Task11 {
    public static void main(String[] args) {
        int n = 10;
        int m = 20;
        int[][] a = new int[n][m];
        int[] count5 = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (16 * Math.random());
                System.out.print("a[" + i + "][" + j + "]=" + a[i][j] + "\t");
                if (a[i][j] == 5) {
                    count5[i]++;
                }
            }
            if (count5[i] >= 3) {
                System.out.print("<-------- this one!!!!");
            }
            System.out.println();
        }
        System.out.println("======================================================================================================================");
        for (int i = 0; i < n; i++) {
            if (count5[i] >= 3) {
                System.out.println("line " + i + " has 3 or more numbers 5");
            }
        }
    }
}
