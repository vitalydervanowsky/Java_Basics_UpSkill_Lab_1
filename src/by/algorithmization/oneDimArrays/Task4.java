package by.algorithmization.oneDimArrays;

public class Task4 {
    public static void main(String[] args) {
        int q = 10;
        int[] a = new int[q];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < q; i++) {
            a[i] = (int)(20 * Math.random());
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            } else {
                if (a[i] < a[minIndex]) {
                    minIndex = i;
                }
            }
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        int temp = a[maxIndex];
        a[maxIndex] = a[minIndex];
        a[minIndex] = temp;
        for (int i = 0; i < q; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }
}
