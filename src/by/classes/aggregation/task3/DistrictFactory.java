package by.classes.aggregation.task3;

public class DistrictFactory implements TerritoryFactory {
    @Override
    public Territory createTerritory() {
        return new District();
    }
}
