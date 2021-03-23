package by.classes.aggregation.task3;

import java.util.ArrayList;

public class Country extends Territory {
    private final City capital;
    private final String name;
    private final double square;
    private final ArrayList<Region> regions;

    public Country(String name, String capital, ArrayList<Region> regions, int square) {
        this.name = name;
        this.capital = new City(capital);
        this.regions = regions;
        this.square = square;
    }

    @Override
    public City getCapital() {
        return capital;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSquare() {
        return square;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }
}
