package by.oop.task1;

public class File {
    private String name = "";
    private Directory directory;
    private String content = "";

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

    public void setName(String name) {
        this.name = name;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public void setContent(String content) {
        this.content = content;
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
