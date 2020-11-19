package by.basicDev.cycles;

import java.util.Scanner;

// Даны два числа.
// Определить цифры, входящие в запись как первого так и второго числа.

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] number;
        number = line.split(" ");
        int m = Integer.parseInt(String.valueOf(number[0]));
        int n = Integer.parseInt(String.valueOf(number[1]));
        System.out.println(m + " " + n);
        for (int i = m; i <= n; i++) {
            int counter = 0;
            System.out.print("For number " + i + " devisions are: ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    counter++;
                    System.out.print(j + " ");
                }
            }
            if (counter == 0) {
                System.out.println("none");
            } else {
                System.out.println();
            }
        }
    }
}