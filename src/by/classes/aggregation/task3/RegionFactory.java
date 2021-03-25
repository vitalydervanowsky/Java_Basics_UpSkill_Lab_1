package by.classes.aggregation.task3;

public class RegionFactory implements TerritoryFactory {
    @Override
    public Territory createTerritory() {
        return new Region();
    }
}
