package by.oop.task1;

public class TextFile extends File {
    public TextFile(String name, Directory directory, String content) {
        super(name, directory, content);
    }

    public void addLine(String line) {
        this.content = getContent() + "\n" + line;
    }

    public void delete() {
        this.name = null;
        this.directory = new Directory(null);
        this.content = null;
    }
}
