package by.classes.simplest.task7;

// Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
// периметра и точки пересечения медиан.

public class Task7 {
    public static void main(String[] args) {
        Point[] points = new Point[3];
        points[0] = new Point(0, 0);
        points[1] = new Point(3, 0);
        points[2] = new Point(0, 4);
        Triangle triangle = new Triangle(points);
        triangle.showPoints();
        System.out.println("perimeter =\t" + triangle.perimeter());
        System.out.println("square =\t" + triangle.square());
        Point medianIntersection = triangle.findOutMedianIntersection();
        System.out.println("medianIntersection" + medianIntersection.toString());
    }
}
