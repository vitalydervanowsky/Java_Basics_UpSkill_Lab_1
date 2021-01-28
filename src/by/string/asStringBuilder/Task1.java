package by.string.asStringBuilder;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем

public class Task1 {
    public static void main(String[] args) {
        String s = "       1.  Дан текст (строка). Найдите      наибольшее количество   подряд идущих пробелов в нем.\n" +
                "2. В строке   вставить после каждого символа 'a'     символ 'b'.\n" +
                "3. Проверить, является ли  заданное слово   палиндромом.";
        String find = " ";
        System.out.println(s);
        int streak = 0;
        int maxStreak = streak;
        boolean isStreak = false;
        for (int i = 0; i < s.length(); i++) {
            if (isSame(s.charAt(i), find) && isStreak) {
                streak++;
                if (streak > maxStreak) {
                    maxStreak = streak;
                }
            } else {
                if (isSame(s.charAt(i), find)) {
                    isStreak = true;
                    streak = 1;
                } else {
                    isStreak = false;
                }
            }
        }
        System.out.println(maxStreak);
    }

    static boolean isSame(char ch, String s) {
        if (s != null && s.length() == 1) {
            return s.charAt(0) == ch;
        }
        return false;
    }
}
