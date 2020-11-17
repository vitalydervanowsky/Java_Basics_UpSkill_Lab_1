package by.basicDev.linear;

public class Task4 {
    public static void main(String[] args) {
        double r = 789.321;
        int rFirst = (int)(r / 1);
//        System.out.println("r1 = " + rFirst);
        int rSecond = (int)((r - rFirst) * 1000);
//        System.out.println("r2 = " + rSecond);
        double rNew = rFirst / 1000.0 + rSecond;
        System.out.println(rNew);
    }
}
