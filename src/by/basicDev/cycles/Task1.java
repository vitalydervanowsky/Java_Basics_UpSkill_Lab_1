package by.basicDev.cycles;

import java.util.Scanner;

// Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity;
        do {
            System.out.println("Please enter a positive number!");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            quantity = sc.nextInt();
        } while (quantity <= 0);
        System.out.println("Thank you! Got " + quantity);

        int result = 0;
        for (int i = 0; i < quantity; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
