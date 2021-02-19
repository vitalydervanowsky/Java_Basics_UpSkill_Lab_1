package by.classes.simplest.task5;

// Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу
// в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
// Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
// Написать код, демонстрирующий все возможности класса.

public class Task5 {
    public static void main(String[] args) {
        Counter c = new Counter(1);
        System.out.println("c  =\t" + c.getCount());
        c.minus();
        System.out.println("c-- =\t" + c.getCount());
        c.plus();
        System.out.println("c++ =\t" + c.getCount());
        c = new Counter();
        System.out.println("c  =\t" + c.getCount());
    }
}
