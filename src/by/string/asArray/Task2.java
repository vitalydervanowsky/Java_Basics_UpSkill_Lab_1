package by.string.asArray;

public class Task2 {
    public static void main(String[] args) {
        String str = "Дан массив word переменных в camelCase. Преобразовать word в snake_case. " +
                "Замените word строке все вхождения 'word' на 'letter'.";
        String find = "word";
        String replace = "letter";
        System.out.println(str);
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
