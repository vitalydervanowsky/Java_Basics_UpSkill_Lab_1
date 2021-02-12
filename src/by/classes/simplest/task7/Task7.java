package by.classes.simplest.task7;

// Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
// периметра и точки пересечения медиан.

public class Task7 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("perimeter =\t" + t.perimeter());
        System.out.println("square =\t" + t.square());
        Point medianIntersection = t.findOutMedianIntersection();
        System.out.println("medianIntersection" + medianIntersection.toString());
    }
}
