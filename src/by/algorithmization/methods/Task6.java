package by.algorithmization.methods;

public class Task6 {
    public static void main(String[] args) {
        int[] a;
        a = create(3);
        show(a);
        if (areSimple(a)) {
            System.out.println("взаимно простые числа");
        } else {
            System.out.println("не взаимно простые числа");
        }
    }

    static boolean areSimple(int[] a) {
        int nod = 0;
        int min = Math.min(Math.min(a[0], a[1]), Math.min(a[1], a[2]));
        for (int i = 1; i <= min; i++) {
            if (a[0] % i == 0 && a[1] % i == 0 && a[2] % i == 0) {
                nod = i;
            }
        }
        return nod == 1;
    }

    static int [] create(int n) {
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(100 * Math.random());
        }
        return a;
    }

    static void show(int[] a) {
        for (int j : a) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }
}
