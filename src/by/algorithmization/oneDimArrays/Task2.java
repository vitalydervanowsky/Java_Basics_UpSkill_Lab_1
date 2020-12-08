package by.algorithmization.oneDimArrays;

public class Task2 {
    public static void main(String[] args) {
        int z = 16;
        int counter = 0;
        int start = 10;
        int finish = 25;
        int quantity = finish - start + 1;
        int[] a = new int[quantity];
        if (start <= z && z <= finish) {
            for (int i = 0; i < quantity; i++) {
                a[i] = i + start;
                if (a[i] > z) {
                    a[i] = z;
                    counter++;
                }
                System.out.print(a[i] + "\t");
            }
        } else {
            System.out.print("Incorrect Z");
        }
        System.out.println();
        if (counter > 0) {
            System.out.println("Quantity of changes = " + counter);
        } else {
            System.out.println("There isn't something to change");
        }
    }
}
