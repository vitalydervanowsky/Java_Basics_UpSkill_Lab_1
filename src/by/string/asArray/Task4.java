package by.string.asArray;

// В строке найти количество чисел

public class Task4 {
    public static void main(String[] args) {
        String str = "1. Дан массив названий переменных в camelCase. Преобразовать 3 b 6 в snake_case.\n" +
                "2. Замените в строке все вхождения 11 1 на 'letter'.\n" +
                "3. В строке найти количество 34 цифр.\n" +
                "4. В строке найти количество чисел.-9";
        System.out.println(str);
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isDigit(str.charAt(i))) {
                if (i + 1 < str.length()) {
                    if (!isDigit(str.charAt(i + 1))) {
                        c++;
                    }
                } else {
                    c++;
                }
            }
        }
        System.out.println(c);
    }

    static boolean isDigit(char ch) {
        String find = "0123456789";
        for (int i = 0; i < find.length(); i++) {
            if (ch == find.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
