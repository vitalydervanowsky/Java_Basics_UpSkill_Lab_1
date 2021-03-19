package by.classes.aggregation.task3;

public class CountryFactory implements TerritoryFactory {
    @Override
    public Territory createTerritory() {
        return new Country();
    }
}
