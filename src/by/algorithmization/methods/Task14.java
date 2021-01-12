package by.algorithmization.methods;

// Натуральное число, в записи которого n цифр, называется числом Армстронга,
// если сумма его цифр, возведенная в степень n, равна самому числу.
// Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

public class Task14 {
    public static void main(String[] args) {
        int k = 1000000;
        for (int i = 1; i < k; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int number) {
        return sumOfPowers(arrayOfNumbers(number)) == number;
    }

    static int lengthOfNumber(int number) {
        int temp = number;
        int c = 0;
        while (temp > 0) {
            temp /= 10;
            c++;
        }
        return c;
    }

    static int[] arrayOfNumbers(int number) {
        int temp = number;
        int [] nums = new int[lengthOfNumber(number)];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp % 10;
            temp /= 10;
        }
        return nums;
    }

    static int sumOfPowers(int[] a) {
        int sum = 0;
        for (int j : a) {
            sum += Math.pow(j, a.length);
        }
        return sum;
    }
}
