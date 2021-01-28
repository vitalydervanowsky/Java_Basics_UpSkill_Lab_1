package by.string.asStringBuilder;

// Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.

public class Task9 {
    public static void main(String[] args) {
        String s = "Home Task Working with a string as a String or StringBuilder";
        System.out.println(s);
        int countUpper = 0;
        int countLower = 0;
        for (int i = 0; i < s.length(); i++) {
            int codePoint = s.codePointAt(i);
            if (codePoint >= 65 && codePoint <= 90) {
                countUpper++;
            } else {
                if (codePoint >= 97 && codePoint <= 122) {
                    countLower++;
                }
            }
        }
        System.out.println("There is " + countUpper + " symbols in upper case");
        System.out.println("There is " + countLower + " symbols in lower case");
    }
}
