package by.string.regex;

// Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий тег,
// закрывающий тег, содержимое тега, тег без тела)

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String xml = "<notes>\n" +
                "  <note id = \"1\">\n" +
                "    <to>Вася</to>\n" +
                "    <from>Света</from>\n" +
                "    <heading>Напоминание</heading>\n" +
                "    <body>Позвони мне завтра!</body>\n" +
                "  </note>\n" +
                "  <note id = \"2\">\n" +
                "    <to>Петя</to>\n" +
                "    <from>Маша</from>\n" +
                "    <heading>Важное напоминание</heading>\n" +
                "    <body/>\n" +
                "  </note>\n" +
                "</notes>";
        parse(xml);
    }

    static void parse(String s) {
        Matcher m = Pattern.compile("<.*>").matcher(s);
        while (m.find()) {
            String line = m.group();
            parseLine(line);
        }
    }

    static void parseLine(String l) {
        Matcher m = Pattern.compile("<(?:\"[^\"]*\"['\"]*|'[^']*'['\"]*|[^'\">])+>").matcher(l);
        while (m.find()) {
            String tag = m.group();
            l = l.replace(tag, "");
            if (tag.contains(" id = \"")) { // перевод на новую строку, если встречается айди
                System.out.println();
            }
            if (tag.charAt(tag.length() - 2) == '/') { // ищем пустой тег
                tag = tag.substring(1, tag.length() - 2);
                System.out.print(tag);
            } else {
                tag = tag.substring(1, tag.length() - 1);
                if (tag.charAt(0) != '/') { // ищем закрывающийся тег
                    System.out.print(tag + " ");
                }
            }
        }
        if (!l.equals("")) {
            System.out.print(l + ". ");
        }
    }
}
