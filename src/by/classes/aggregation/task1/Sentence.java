package by.classes.aggregation.task1;

public class Sentence {
    private final Word[] words;

    public Sentence(Word[] words) {
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
