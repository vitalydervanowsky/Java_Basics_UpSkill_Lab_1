package by.string.asStringBuilder;

// Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde def", то должно быть выведено "abcdef"

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        String s = inputString();
        StringBuilder b = new StringBuilder();
        b.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != b.charAt(b.length() - 1) && s.charAt(i) != ' ') {
                b.append(s.charAt(i));
            }
        }
        System.out.println("b=" + b);
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
