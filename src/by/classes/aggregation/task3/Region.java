package by.classes.aggregation.task3;

public class Region {
    private final City capital;
    private final String name;

    public Region(String name, String capital) {
        this.name = name;
        this.capital = new City(capital);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + " with capital in " + getCapital();
    }

    public String getCapital() {
        return capital.getCity();
    }
}
