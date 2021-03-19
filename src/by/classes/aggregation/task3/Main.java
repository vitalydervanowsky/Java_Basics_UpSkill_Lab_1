package by.classes.aggregation.task3;

// Создать объект класса Государство, используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        TerritoryFactory tf = new CountryFactory();
//        Country country = (Country) tf.createTerritory();
        Country country = new Country();
        country.setName("Belarus");
        country.setCapital("Minsk");
        country.setRegions(createBelarusRegions());
        System.out.println("The capital of " + country.getName() + " is " + country.getCapital().getName());
        System.out.println("There are " + country.getRegions().size() + " regions");
        showRegions(country);
        showCapitalsOfRegions(country);
        country.setSquare(207600);
        System.out.println("Total area is " + country.getSquare() + " km2");
    }

//    private static TerritoryFactory createCountry(String name) {
//        if (name.equalsIgnoreCase("belarus")){
//            City c = new City("Minsk");
//            return new CountryFactory();
//        } else {
//            throw new RuntimeException(name + "is not a country");
//        }
//    }

    public static ArrayList<Region> createBelarusRegions() {
        ArrayList<Region> regions = new ArrayList<>();
        String[] caps = {"Brest", "Vitebsk", "Gomel", "Grodno", "Minsk", "Mogilev"};
        for (String cap : caps) {
            Region region = new Region();
            region.setCapital(cap);
            region.setName(cap + " region");
            regions.add(region);
        }
        return regions;
    }

    public static void showRegions(Country country) {
        ArrayList<Region> regions = country.getRegions();
        for (Region region : regions) {
            System.out.println(region.toString());
        }
    }

    public static void showCapitalsOfRegions(Country country) {
        ArrayList<Region> regions = country.getRegions();
        for (Region region : regions) {
            System.out.println(region.getCapital().getName());
        }
    }
}