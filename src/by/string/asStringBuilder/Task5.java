package by.string.asStringBuilder;

// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”

public class Task5 {
    public static void main(String[] args) {
        String s = "Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.\n" +
                "Случай, когда самых длинных слов может быть несколько, не обрабатывать";
        String symbol = "а";
        System.out.println(s);
        System.out.println(countSymbol(s, symbol));
    }

    static int countSymbol(String s, String symbol) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isSame(s.charAt(i), symbol)) {
                c++;
            }
        }
        return c;
    }

    static boolean isSame(char ch, String s) {
        if (s != null && s.length() == 1) {
            return s.charAt(0) == ch;
        }
        return false;
    }
}
