package by.classes.aggregation.task3;

import java.util.ArrayList;

public class CountryFactory implements TerritoryFactory {
    @Override
    public Territory createTerritory() {
        ArrayList<Region> regions = new ArrayList<>();
        String[] caps = {"Brest", "Vitebsk", "Gomel", "Grodno", "Minsk", "Mogilev"};
        for (String cap : caps) {
            Region region = new Region();
            region.setCapital(cap);
            region.setName(cap + " region");
            regions.add(region);
        }
        return new Country("Belarus", "Minsk", regions, 207600);
    }
}
