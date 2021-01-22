package by.string.asArray;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Task1 {
    public static void main(String[] args) {
        String [] varOfArray = new String[5];
        varOfArray[0] = "camelCase";
        varOfArray[1] = "varOfArray";
        varOfArray[2] = "StringBuilder";
        varOfArray[3] = "codePointAt";
        varOfArray[4] = "asArray";
        for (String s : varOfArray) {
            System.out.print(s + "   >>>>>   ");
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                int codePoint = s.codePointAt(i);
                if (codePoint >= 65 && codePoint <= 90 && i != 0) {
                    builder.append("_");
                }
                builder.append(s.charAt(i));
            }
            s = builder.toString().toLowerCase();
            System.out.println(s);
        }
    }
}
