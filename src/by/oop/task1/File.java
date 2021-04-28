package by.oop.task1;

public class File {
    protected String name;
    protected Directory directory;
    protected String content;

    public File(String name, Directory directory, String content) {
        this.name = name;
        this.directory = directory;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public Directory getDirectory() {
        return directory;
    }

    public String getContent() {
        return content;
    }

    public void rename(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + getName() + '\'' +
                ", directory=" + getDirectory().getPath() +
                ", content='" + getContent() + '\'' +
                '}';
    }
}
