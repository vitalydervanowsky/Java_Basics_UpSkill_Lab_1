package by.classes.aggregation.task2;

public class Wheel {
    private int width;
    private int height;
    private int diameter;

    public Wheel(int width, int height, int diameter) {
        this.width = width;
        this.height = height;
        this.diameter = diameter;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return width + "/" + height + "R" + diameter;
    }
}
