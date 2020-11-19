package by.basicDev.cycles;

// Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task4 {
    public static void main(String[] args) {
        double result = 1;
        for (int i = 1; i < 99; i++) {
            result = result * i * i;
        }
        System.out.println(result);
    }
}
