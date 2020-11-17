package by.basicDev.linear;

public class Task6 {
    public static void main(String[] args) {
        int x = 5;
        int y = -2;
        boolean result = (y > 0 && y <= 4 && x >= -2 && x <= 2) || (y <= 0 && y >= -3 && x >= -4 && x <= 4);
        System.out.println(result);
    }
}
