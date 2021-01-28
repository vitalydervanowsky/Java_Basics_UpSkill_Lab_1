package by.string.asStringBuilder;

// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        do {
            System.out.println("Please enter a line!");
            s = sc.nextLine();
        } while (s.length() <= 0);
        System.out.println("s=" + s);
        String[] arr = s.split("\\s+");
        System.out.println("** \"" + arr[maxLength(arr)] + "\" has max length");
    }

    static int maxLength(String [] a) {
        int max = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i].length() > a[max].length()) {
                max = i;
            }
        }
        return max;
    }
}
