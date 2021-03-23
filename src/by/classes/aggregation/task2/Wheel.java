package by.classes.aggregation.task2;

public class Wheel {
    private final int width;
    private final int height;
    private final int diameter;

    public Wheel(int width, int height, int diameter) {
        this.width = width;
        this.height = height;
        this.diameter = diameter;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return width + "/" + height + "R" + diameter;
    }
}
