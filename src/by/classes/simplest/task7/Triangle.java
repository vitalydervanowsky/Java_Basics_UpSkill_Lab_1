package by.classes.simplest.task7;

// Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
// периметра и точки пересечения медиан.

public class Triangle {
    Point [] points;

    public Triangle(Point[] points) {
        this.points = points;
    }

    public void showPoints() {
        for (int i = 0; i < points.length; i++) {
            System.out.println("point" + i + "(" + points[i].getX() + ", " + points[i].getY() + ")");
        }
    }

    public double length(Point a, Point b) {
        double x = Math.abs(Math.max(a.getX(), b.getX()) - Math.min(a.getX(), b.getX()));
        double y = Math.abs(Math.max(a.getY(), b.getY()) - Math.min(a.getY(), b.getY()));
        return Math.sqrt(x * x + y * y);
    }

    public double perimeter() {
        return length(this.points[0], this.points[1]) +
                length(this.points[1], this.points[2]) +
                length(this.points[0], this.points[2]);
    }

    public double square() {
        double p = perimeter() / 2;
        double a = length(this.points[0], this.points[1]);
        double b = length(this.points[1], this.points[2]);
        double c = length(this.points[0], this.points[2]);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public Point findOutMedianIntersection() {
        double xM = (this.points[1].getX() - this.points[2].getX()) / 2 + this.points[2].getX();
        double yM = (this.points[1].getY() - this.points[2].getY()) / 2 + this.points[2].getY();
        double x = (xM - this.points[0].getX()) / 3 * 2 + this.points[0].getX();
        double y = (yM - this.points[0].getY()) / 3 * 2 + this.points[0].getY();
        return new Point(x, y);
    }
}
