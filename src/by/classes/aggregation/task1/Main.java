package by.classes.aggregation.task1;

public class Main {
    public static void main(String[] args) {
        Text text = new Text("Home Task: Aggregation and composition");
        text.addText("1. Создать объект класса Текст, используя классы Предложение, Слово. " +
                "Методы: дополнить текст, вывести на консоль текст, заголовок текста.");
        text.addText("2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. " +
                "Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.");
        System.out.println(text.show());
    }
}
