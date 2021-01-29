package by.string.asStringBuilder;

// Проверить, является ли заданное слово палиндромом.

public class Task3 {
    public static void main(String[] args) {
        String s = "Tenet";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String str) {
        StringBuilder b = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            b.append(str.charAt(i));
        }
        System.out.println("s=" + str);
        System.out.println("b=" + b);

        return (b.toString().equals(str));
    }
}
