package by.algorithmization.methods;

// Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
// Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
// Для решения задачи использовать декомпозицию.

public class Task13 {
    public static void main(String[] args) {
        int n = (int) (98 * Math.random() + 2);
        System.out.println("[" + n + ", " + (2 * n) + "]");
        findTween(n);
    }

    static void findTween(int n) {
        for (int i = n; i < 2*n-1; i++) {
            if (isSimple(i) && isSimple(i + 2)) {
                System.out.println(i + " & " + (i + 2));
            }
        }
    }

    public static boolean isSimple(int i) {
        if (i <= 1) {
            return false;
        } else {
            if (i <= 3) {
                return true;
            } else {
                if (i % 2 == 0 || i % 3 == 0) {
                    return false;
                }
            }
        }
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0) {
                return false;
            }
            n = n + 6;
        }
        return true;
    }
}
