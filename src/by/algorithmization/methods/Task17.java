package by.algorithmization.methods;

// 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль?
// Для решения задачи использовать декомпозицию.

public class Task17 {
    public static void main(String[] args) {
        int n = (int)(100 * Math.random());
        System.out.println(n);
        System.out.println(operate(n));
    }

    static int operate(int n) {
        int temp = n;
        int counter = 0;
        do {
            temp = temp - sumOfNums(temp);
            counter++;
        } while (temp > 0);
        return counter;
    }

    static int sumOfNums(int n) {
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}
