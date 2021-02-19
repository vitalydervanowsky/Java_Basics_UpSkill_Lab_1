package by.classes.simplest.task1;

// Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
// из этих двух переменных.

public class Test1 {
    int a;
    int b;

    public int maxAB(int a, int b) {
        return Math.max(a, b);
    }

    public int sumAB(int a, int b) {
        return a + b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
