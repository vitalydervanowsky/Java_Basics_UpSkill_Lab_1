package by.oop.task1;

public class Main {
    public static void main(String[] args) {
        TextFile textFile = createTextFile();
        System.out.println(textFile.toString());
        textFile.setName("newName.txt");
        System.out.println(textFile.toString());
        textFile.addLine("Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.");
        System.out.println(textFile.toString());
        textFile.delete();
        System.out.println(textFile.toString());
    }

    public static TextFile createTextFile() {
        return new TextFile(
                "name.txt",
                new Directory("tmp.dir"),
                "Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить."
        );
    }
}
