package by.string.asStringBuilder;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем

public class Task1 {
    public static void main(String[] args) {
        String s = "       1.  Дан текст (строка). Найдите      наибольшее количество   подряд идущих пробелов в нем.\n" +
                "2. В строке   вставить после каждого символа 'a'     символ 'b'.\n" +
                "3. Проверить, является ли  заданное слово   палиндромом.";
        System.out.println(s);
        int streak = 0;
        int maxStreak = streak;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) {
                streak++;
                if (streak > maxStreak) {
                    maxStreak = streak;
                }
            } else {
                streak = 0;
            }
        }
        System.out.println(maxStreak);
    }
}
