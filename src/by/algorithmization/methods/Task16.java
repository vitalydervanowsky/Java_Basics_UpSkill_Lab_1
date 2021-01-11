package by.algorithmization.methods;

// Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Task16 {
    public static void main(String[] args) {
        int n = 3;
        int sum = findSumOfOdd(n);
        System.out.println("Сумма чисел, состоящих из нечетных цифр, для всех " + n + "-значных = " + sum);
        System.out.println("Количество четных цифр в найденной сумме = " + countEvenNum(sum));
    }

    static int findSumOfOdd(int n) {
        int sum = 0;
        int first = findFirstNum(n);
        int last = findLastNum(n);
        for (int i = first; i <= last; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    static int findFirstNum(int n) {
        int first = 0;
        if (n > 1) {
            first = 1;
            for (int i = 1; i < n; i++) {
                first *= 10;
            }
        }
        return first;
    }

    static int findLastNum(int n) {
        int last = 1;
        for (int i = 1; i <= n; i++) {
            last *= 10;
        }
        last--;
        return last;
    }

    static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    static int countEvenNum(int i) {
        int number = i;
        int counter = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                counter++;
            }
            number /= 10;
        }
        return counter;
    }
}
