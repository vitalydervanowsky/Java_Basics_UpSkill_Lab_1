package by.classes.aggregation.task3;

public class Territory {
    private final City capital = new City();
    private String name;
    private double square;

//    public Territory() {
//    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital.setName(capital);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return getName() + " with capital in " + getCapital().getName();
    }
}
