package by.algorithmization.methods;

public class Task10 {
    public static void main(String[] args) {
        long n = 2359745589L;
        int [] nums = new int[length(n)];
        toNums(n, nums);
        show(nums);
    }

    static int length(long a) {
        int l = 0;
        long temp = a;
        while(temp > 0) {
            l++;
            temp /= 10;
        }
        return l;
    }

    static void toNums(long n, int[] a) {
        long temp = n;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (temp % 10);
            temp /= 10;
        }
    }

    static void show(int[] a) {
        for (int j : a) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }
}
