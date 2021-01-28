package by.string.asStringBuilder;

// Из заданной строки получить новую, повторив каждый символ дважды

public class Task6 {
    public static void main(String[] args) {
        String s = "Из заданной строки получить новую, повторив каждый символ дважды";
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            b.append(s.charAt(i)).append(s.charAt(i));
        }
        System.out.println(s);
        System.out.println(b);
    }
}
