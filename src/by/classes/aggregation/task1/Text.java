package by.classes.aggregation.task1;

// Создать объект класса Текст, используя классы Предложение, Слово.
// Методы: дополнить текст, вывести на консоль текст, заголовок текста.

public class Text {
    private final String title;
    private String text = "";

    public Text() {
        title = "";
    }

    public Text(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String show() {
        return getTitle() + "\n" + getText();
    }

    public void addText(String text) {
        this.text += text + "\n";
    }
}
