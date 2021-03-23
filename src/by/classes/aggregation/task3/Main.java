package by.classes.aggregation.task3;

// Создать объект класса Государство, используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TerritoryFactory tf = new CountryFactory();
        Country country = (Country) tf.createTerritory();
        System.out.println("The capital of " + country.getName() + " is " + country.getCapital().getName());
        System.out.println("There are " + country.getRegions().size() + " regions");
        showRegions(country);
        showCapitalsOfRegions(country);
        System.out.println("Total area is " + country.getSquare() + " km2");
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