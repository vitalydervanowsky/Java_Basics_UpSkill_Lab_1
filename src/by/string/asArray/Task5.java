package by.string.asArray;

// Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить

public class Task5 {
    public static void main(String[] args) {
        String str = "   Дан массив word переменных в camelCase. Преобразовать   camelCase  в snake_case. " +
                "Замените word строке все вхождения    'word' на 'letter'.  ";
        System.out.println(str);
        str = str.replace("  ", " ").trim();
        System.out.println(str);
    }
}
