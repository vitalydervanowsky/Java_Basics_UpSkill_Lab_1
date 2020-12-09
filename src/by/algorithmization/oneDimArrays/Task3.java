package by.algorithmization.oneDimArrays;

public class Task3 {
    public static void main(String[] args) {
        int[] a = {56, 8, -14, 0, -77, 63, 2, 0, -99, -7, 40};
        int counterPos = 0;
        int counterNeg = 0;
        int counterZero = 0;
        for (int j : a) {
            System.out.print(j + "\t\t");
            if (j < 0) {
                counterNeg++;
            } else {
                if (j == 0) {
                    counterZero++;
                } else {
                    counterPos++;
                }
            }
        }
        System.out.println();
        System.out.println("there is " + counterNeg + " negative numbers");
        System.out.println("there is " + counterZero + " zeros");
        System.out.println("there is " + counterPos + " positive numbers");
    }
}
