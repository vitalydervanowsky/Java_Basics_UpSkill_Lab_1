package by.classes.simplest.task5;

// Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу
// в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
// Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
// Написать код, демонстрирующий все возможности класса.

public class Counter {
    private int count;

    public int getCount() {
        return count;
    }

    public Counter() {
        this(0);
    }

    public Counter(int count) {
        this.count = count;
    }

    public void plus() {
        this.count++;
    }

    public void minus() {
        this.count--;
    }
}
