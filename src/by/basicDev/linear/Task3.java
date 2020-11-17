package by.basicDev.linear;

import static java.lang.Math.*;

public class Task3 {
    public static void main(String[] args) {
        double x = 0.89;
        double y = 0.4;
        double result;
        result = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
        System.out.println(result);
    }
}
