package by.basicDev.cycles;

// Найти сумму квадратов первых ста чисел.

public class Task3 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i <= 100; i++) {
           result += i * i;
        }
        System.out.println(result);
    }
}
