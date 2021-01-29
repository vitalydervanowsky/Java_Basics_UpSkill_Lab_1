package by.string.asStringBuilder;

// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”

public class Task5 {
    public static void main(String[] args) {
        String s = "Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.\n" +
                "Случай, когда самых длинных слов может быть несколько, не обрабатывать";
        char symbol = 'а';
        System.out.println(s);
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == symbol) {
                c++;
            }
        }
        System.out.println(c);
    }
}
