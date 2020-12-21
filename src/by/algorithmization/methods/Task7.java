package by.algorithmization.methods;

public class Task7 {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(sumOfFactorials(n));
    }

    static int sumOfFactorials(int i) {
        int sum = 0;
        for (int j = 1; j <= i; j += 2) {
            sum += factorial(j);
        }
        return sum;
    }

    static int factorial(int i) {
        int result = 1;
        for (int j = 1; j <= i; j++) {
            result *= j;
        }
        return result;
    }
}
