package by.classes.aggregation.task1;

// Создать объект класса Текст, используя классы Предложение, Слово.
// Методы: дополнить текст, вывести на консоль текст, заголовок текста.

public class Main {
    public static void main(String[] args) {
        Text text = new Text("header of the text", initSentences());
        text.getText();
        Sentence sentence = new Sentence(initWords());
        text.addSentence(sentence);
        text.getText();
    }

    private static Word[] initWords() {
        int rand = (int)(15 * Math.random() + 1);
        Word[] words = new Word[rand];
        for (int i = 0; i < rand; i++) {
            words[i] = new Word("word" + (i + 1));
        }
        return words;
    }

    private static Sentence[] initSentences() {
        int rand = (int)(5 * Math.random() + 1);
        Sentence[] sentences = new Sentence[rand];
        for (int i = 0; i < rand; i++) {
            sentences[i] = new Sentence(initWords());
        }
        return sentences;
    }
}
