package by.string.asArray;

// Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить

public class Task5 {
    public static void main(String[] args) {
        String str = "   Дан массив word переменных в camelCase. Преобразовать   camelCase  в snake_case. " +
                "Замените word строке все вхождения    'word' на 'letter'.  ";
        String find = "  ";
        String replace = " ";
        System.out.println(str);
        str = str.trim();
        while (str.contains(find)) {
            int start = 0;
            int finish = str.indexOf(find);
            String temp = str.substring(start, finish) + replace;
            start = finish + find.length();
            finish = str.length();
            str = temp + str.substring(start, finish);
        }
        System.out.println(str);
    }
}
