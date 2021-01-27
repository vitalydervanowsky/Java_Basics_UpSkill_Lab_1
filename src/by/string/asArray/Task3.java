package by.string.asArray;

// В строке найти количество цифр

public class Task3 {
    public static void main(String[] args) {
        String str = "1. Дан массив названий переменных в camelCase. Преобразовать 3 b 6 в snake_case.\n" +
                "2. Замените в строке все вхождения 111 на 'letter'.\n" +
                "3. В строке найти количество 34 цифр.\n" +
                "4. В строке найти количество чисел.";
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                c++;
            }
        }
        System.out.println(str);
        System.out.println(c);
    }
}
