package by.classes.aggregation.task5;

public enum OfferMeals {
    WITHOUT(0, "without meals"),
    WITH(1, "with meals");

    private final int index;
    private final String name;

    OfferMeals(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return name;
    }
}
