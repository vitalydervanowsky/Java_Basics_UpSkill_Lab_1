package by.string.asStringBuilder;

// Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde def", то должно быть выведено "abcdef"

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        do {
            System.out.println("Please enter a line!");
            s = sc.nextLine();
        } while (s.length() <= 0);
        System.out.println("s=" + s);
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            boolean isExclusiveSymbol = true;
            for (int j = 0; j < b.length(); j++) {
                isExclusiveSymbol = s.charAt(i) != b.charAt(j);
                if (!isExclusiveSymbol) {
                    j = b.length();
                }
            }
            if (isExclusiveSymbol && !(s.charAt(i) == " ".charAt(0))) {
                b.append(s.charAt(i));
            }
        }
        System.out.println("b=" + b);
    }
}
