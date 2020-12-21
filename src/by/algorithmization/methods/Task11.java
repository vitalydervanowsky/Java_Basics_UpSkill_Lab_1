package by.algorithmization.methods;

public class Task11 {
    public static void main(String[] args) {
        long n = (long) (Math.random() * (Math.pow(10, (Math.random() * 10))));
        System.out.println(n);
        long m = (long) (Math.random() * (Math.pow(10, (Math.random() * 10))));
        System.out.println(m);
        System.out.println(compare(n, m));
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

    static String compare(long n, long m) {
        if (length(n) > length(m)) {
            return "n > m";
        } else {
            if (length(n) == length(m)) {
                return "n == m";
            } else {
                return "n < m";
            }
        }
    }
}
