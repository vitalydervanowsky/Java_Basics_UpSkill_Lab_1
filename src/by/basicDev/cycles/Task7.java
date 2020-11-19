package by.basicDev.cycles;

import java.util.Scanner;

// Даны два числа.
// Определить цифры, входящие в запись как первого так и второго числа.

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String [] number;
        number = line.split(" ");
        boolean[] numberIsPresent = new boolean[10];
        for (int i = 0; i < number[0].length(); i++) {
            for (int j = 0; j < number[1].length(); j++) {
                if (number[0].charAt(i) == number[1].charAt(j) &&
                        !numberIsPresent[Integer.parseInt(String.valueOf(number[0].charAt(i)))]) {
                    numberIsPresent[Integer.parseInt(String.valueOf(number[0].charAt(i)))] = true;
                }
            }
        }
        for (int i = 0; i < numberIsPresent.length; i++) {
            if (numberIsPresent[i]) {
                System.out.println(i);
            }
        }
    }
}
