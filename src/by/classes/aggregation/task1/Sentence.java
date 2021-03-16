package by.classes.aggregation.task1;

public class Sentence {
    private Word[] words;

    public void setSentence(Word[] words) {
        this.words = words;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Word word : words) {
            result.append(word.getWord()).append(" ");
        }
        return result.toString();
    }
}
