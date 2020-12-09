package by.algorithmization.oneDimArrays;

public class Task2 {
    public static void main(String[] args) {
        int counter = 0;
        int start = 0;
        int finish = 20;
        int z = start + (int)((finish - start) * Math.random());
        System.out.println(z);
        int n = finish - start + 1;
        int[] a = new int[n];
        for (int i = start; i < finish; i++) {
            a[i] = (int)((finish - start) * Math.random());
            if (a[i] > z) {
                a[i] = z;
                counter++;
            }
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        if (counter > 0) {
            System.out.println("Quantity of changes = " + counter);
        } else {
            System.out.println("There isn't something to change");
        }
    }
}
