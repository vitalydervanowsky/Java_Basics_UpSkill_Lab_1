package by.string.asStringBuilder;

// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        String s = inputString();
        int max = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                c++;
            } else {
                if (max < c) {
                    max = c;
                }
                c = 0;
            }
        }
        if (max < c) {
            max = c;
        }
        System.out.println(max);
    }

    static String inputString() {
        String s;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please enter a line!");
            s = sc.nextLine();
        } while (s.length() <= 0);
        return s;
    }
}
