package by.string.asArray;

// Замените в строке все вхождения 'word' на 'letter'.

public class Task2 {
    public static void main(String[] args) {
        String str = "Дан массив word переменных в camelCase. Преобразовать word в snake_case. " +
                "Замените word строке все вхождения 'word' на 'letter'.";
        String find = "word";
        String replace = "letter";
        System.out.println(str);
        int start = 0;
        int finish;
        StringBuilder b = new StringBuilder();
        while (start < str.length()) {
            finish = str.indexOf(find, start);
            if (finish > 0) {
                b.append(str, start, finish).append(replace);
            } else {
                finish = str.length();
                b.append(str, start, finish);
            }
            start = finish + find.length();
        }
        str = b.toString();
        System.out.println(str);
    }
}
