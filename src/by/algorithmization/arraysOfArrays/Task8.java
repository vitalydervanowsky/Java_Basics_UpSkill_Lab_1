package by.algorithmization.arraysOfArrays;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int n = 4;
        int m = 4;
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (100 * Math.random());
                System.out.print("a[" + i + "][" + j + "]=" + a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("======================================================================================================================");
        boolean dataIsOK;

        do {
            System.out.println("Please enter two rows to change (first >= 0 && first < second && second <= " + (m - 1) + ")");
            String line = sc.nextLine();
            String[] numbers;
            numbers = line.split(" ");
            String stringM = String.valueOf(numbers[0]);
            String stringN = String.valueOf(numbers[1]);
            boolean mIsInteger = isInteger(stringM);
            boolean nIsInteger = isInteger(stringN);
            if (mIsInteger && nIsInteger) {
                first = Integer.parseInt(stringM);
                second = Integer.parseInt(stringN);
                System.out.println(first + " " + second);
            }
            dataIsOK = first >= 0 && first < second && second < m;
        } while (!dataIsOK);

        for (int i = 0; i < n; i++) {
            int temp = a[i][first];
            a[i][first] = a[i][second];
            a[i][second] = temp;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a[" + i + "][" + j + "]=" + a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
}
