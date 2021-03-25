package by.classes.aggregation.task1;

import java.util.Arrays;

public class Text {
    private final String header;
    private Sentence[] sentences;

    public Text(String header, Sentence[] sentences) {
        this.header = header;
        this.sentences = sentences;
    }

    public String getHeader() {
        return header;
    }

    public String getSentences() {
        return Arrays.toString(sentences);
    }

    public void getText() {
        System.out.println(getHeader());
        System.out.println(getSentences());
    }

    public void addSentence(Sentence sentence) {
        int newLength = sentences.length + 1;
        Sentence[] newSentences = new Sentence[newLength];
        for (int i = 0; i < newLength; i++) {
            if (i < sentences.length) {
                newSentences[i] = sentences[i];
            } else {
                newSentences[i] = sentence;
            }
        }
        sentences = newSentences;
    }
}
