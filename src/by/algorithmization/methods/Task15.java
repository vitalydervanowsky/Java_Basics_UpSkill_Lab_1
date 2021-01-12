package by.algorithmization.methods;

// Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class Task15 {
    public static void main(String[] args) {
        int n = 5;
        int first = startPosition(n);
        int last = finishPosition(n);
        System.out.println(first + " .. " + last + " : ");
        int c = 0;
        for (int i = first; i < last; i++) {
            if (isGrowingArray(arrayOfNumbers(i))) {
                System.out.print(i + " ");
                c++;
                if (c % 20 == 0 && c != 0) {
                    System.out.println();
                }
            }
        }
    }

    static int startPosition(int n) {
        int first = 0;
        if (n > 1) {
            first = (int) Math.pow(10, n - 1);
        }
        return first;
    }

    static int finishPosition(int n) {
        return (int) Math.pow(10, n);
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

    static boolean isGrowingArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] <= a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
