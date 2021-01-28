package by.string.asStringBuilder;

// С помощью функции копирования и операции конкатенации
// составить из частей слова “информатика” слово “торт”

public class Task4 {
    public static void main(String[] args) {
        String s = "Информатика";
        //          01234567890
        String newS = s.charAt(7) + s.substring(3, 5) + s.charAt(7);
        System.out.println(newS);
//        StringBuilder b = new StringBuilder();
//        b.append(s.charAt(7)).append(s, 3, 5).append(s.charAt(7));
//        System.out.println(b);
    }
}
