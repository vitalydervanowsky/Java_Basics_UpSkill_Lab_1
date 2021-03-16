package by.classes.aggregation.task1;

import java.util.Arrays;

public class Text {
    private String header;
    private Sentence[] sentences;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getSentences() {
        return Arrays.toString(sentences);
    }

    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public void getText() {
        System.out.println(getHeader());
        System.out.println(getSentences());
    }

    public void addSentence(Sentence sentence) {
        int newLength = sentences.length + 1;
        Sentence[] newSentences = new Sentence[newLength];
        for (int i = 0; i < newLength; i++) {
            newSentences[i] = new Sentence();
            if (i < sentences.length) {
                newSentences[i] = sentences[i];
            } else {
                newSentences[i] = sentence;
            }
        }
        sentences = newSentences;
    }
}
