package by.oop.task1;

public class TextFile extends File {
    public TextFile(String name, Directory directory, String content) {
        super(name, directory, content);
    }

    public void addLine(String line) {
        setContent(getContent() + "\n" + line);
    }

    public void delete() {
        setName("");
        setDirectory(new Directory(""));
        setContent("");
    }
}
