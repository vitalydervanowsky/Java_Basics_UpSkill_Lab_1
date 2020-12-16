package by.algorithmization.methods;

public class Task4 {
    public static void main(String[] args) {
        int n = 3;
        int[][] points = new int[n][2];
        createArray(points);
        int[] max = findMaxDistance(points);
        System.out.println("between " + max[0] + " and " + max[1] + " distance is " + twoPointsDistance(points, max[0], max[1]));
    }

    static void createArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("point A" + i + " =\t");
            for (int j = 0; j < 2; j++) {
                a[i][j] = (int) (Math.random() * 5) ;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[] findMaxDistance (int[][] a) {
        int[] max = {0, 1};
        double maxDistance = twoPointsDistance(a, 0, 1);
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (twoPointsDistance(a, i, j) > maxDistance) {
                    max = new int[]{i, j};
                    maxDistance = twoPointsDistance(a, max[0], max[1]);
                }
            }
        }
        return max;
    }

    static double twoPointsDistance (int[][] a, int n, int m) {
        return Math.sqrt((a[n][0] - a[m][0]) * (a[n][0] - a[m][0]) + (a[n][1] - a[m][1]) * (a[n][1] - a[m][1]));
    }
}
