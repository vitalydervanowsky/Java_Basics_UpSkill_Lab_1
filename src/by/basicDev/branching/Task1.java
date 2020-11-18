package by.basicDev.branching;

// Даны два угла треугольника (в градусах).
// Определить, существует ли такой треугольник, и если да,
// то будет ли он прямоугольным.

public class Task1 {
    public static void main(String[] args) {
        double angle1 = 30;
        double angle2 = 90;
        double angle3 = 180 - angle1 - angle2;
        boolean isTriangle = false;
        boolean isRightTriangle = false;
        if (angle3 > 0) {
            isTriangle = true;
            isRightTriangle = angle1 == 90 || angle2 == 90 || angle3 == 90;
        }
        System.out.println("isTriangle=" + isTriangle + ", isRightTriangle=" + isRightTriangle);
    }
}
