package by.classes.aggregation.task3;

import java.util.ArrayList;

public class Country extends Territory {
    private final City capital = new City();
    private String name;
    private double square;
    private ArrayList<Region> regions;

//    public Country() {
//        super();
//    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }
}
