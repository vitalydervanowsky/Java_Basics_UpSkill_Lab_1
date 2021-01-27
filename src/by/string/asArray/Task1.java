package by.string.asArray;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Task1 {
    public static void main(String[] args) {
        String [] arrayOfNames = new String[5];
        arrayOfNames[0] = "camelCase";
        arrayOfNames[1] = "arrayOfNames";
        arrayOfNames[2] = "StringBuilder";
        arrayOfNames[3] = "codePointAt";
        arrayOfNames[4] = "asArray";
        for (String s : arrayOfNames) {
            System.out.print(s + "   >>>>>   ");
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i)) && i != 0) {
                    builder.append("_");
                }
                builder.append(s.charAt(i));
            }
            s = builder.toString().toLowerCase();
            System.out.println(s);
        }
    }
}
