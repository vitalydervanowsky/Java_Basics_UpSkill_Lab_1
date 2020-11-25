package by.basicDev.cycles;

import java.util.Scanner;

// Даны два числа.
// Определить цифры, входящие в запись как первого так и второго числа.

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0;
        int n = 0;
        boolean dataIsOK;

        do {
            System.out.println("Please enter two positive numbers (first < second)");
            String line = sc.nextLine();
            String[] numbers;
            numbers = line.split(" ");
            String stringM = String.valueOf(numbers[0]);
            String stringN = String.valueOf(numbers[1]);
            boolean mIsInteger = isInteger(stringM);
            boolean nIsInteger = isInteger(stringN);
            if (mIsInteger && nIsInteger) {
                m = Integer.parseInt(stringM);
                n = Integer.parseInt(stringN);
                System.out.println(m + " " + n);
            }
            dataIsOK = m < n && m > 0;
        } while (!dataIsOK);

        for (int i = m; i <= n; i++) {
            boolean hasDevisions = false;
            System.out.print("For number " + i + " devisions are: ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    hasDevisions = true;
                    System.out.print(j + " ");
                }
            }
            if (hasDevisions) {
                System.out.println();
            } else {
                System.out.println("none");
            }
        }
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
}