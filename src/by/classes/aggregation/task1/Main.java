package by.classes.aggregation.task1;

// Создать объект класса Текст, используя классы Предложение, Слово.
// Методы: дополнить текст, вывести на консоль текст, заголовок текста.

public class Main {
    public static void main(String[] args) {
        Text text = initText();
        text.getText();
        Word[] words = initWords();
        Sentence sentence = new Sentence();
        sentence.setSentence(words);
        text.addSentence(sentence);
        text.getText();
    }

    private static Word[] initWords() {
        int rand = (int)(15 * Math.random() + 1);
        Word[] words = new Word[rand];
        for (int i = 0; i < rand; i++) {
            words[i] = new Word();
            words[i].setWord("word" + (i + 1));
        }
        return words;
    }

    private static Sentence[] initSentences() {
        int rand = (int)(5 * Math.random() + 1);
        Sentence[] sentences = new Sentence[rand];
        for (int i = 0; i < rand; i++) {
            Word[] w = initWords();
            sentences[i] = new Sentence();
            sentences[i].setSentence(w);
        }
        return sentences;
    }

    private static Text initText() {
        Text text = new Text();
        text.setHeader("header of the text");
        text.setSentences(initSentences());
        return text;
    }
}
