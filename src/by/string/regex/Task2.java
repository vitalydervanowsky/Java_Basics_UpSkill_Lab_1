package by.string.regex;

// Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий тег,
// закрывающий тег, содержимое тега, тег без тела)

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

    static void parse(String str) {
        String s = str;
        while (s.length() > 9) {
            String note = s.substring(s.indexOf("<note "), s.indexOf("</note>") + 7);
            int noteId = Integer.parseInt(note.substring(note.indexOf("<note id = \"") + 12, note.indexOf("\">")));
            String noteTo = note.substring(note.indexOf("<to>") + 4, note.indexOf("</to>"));
            String noteFrom = note.substring(note.indexOf("<from>") + 6, note.indexOf("</from>"));
            String noteHeading = note.substring(note.indexOf("<heading>") + 9, note.indexOf("</heading>"));
            String noteBody = note.substring(note.indexOf("<body") + 5);
            if (noteBody.charAt(0) == '/') {
                noteBody = "";
            } else {
                noteBody = ": " + note.substring(note.indexOf("<body>") + 6, note.indexOf("</body>"));
            }

            String newNote = "* Note " + noteId + " to " + noteTo + " from " + noteFrom + ":\n" + noteHeading + noteBody;
            System.out.println(newNote);

            s = s.substring(s.indexOf("</note>") + 7);
        }
    }
}
