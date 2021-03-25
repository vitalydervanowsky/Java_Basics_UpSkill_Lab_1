package by.classes.aggregation.task5;

public enum OfferType {
    RELAXATION(0, "relaxation"),
    EXCURSION(1, "excursion"),
    TREATMENT(2, "treatment"),
    SHOPPING(3, "shopping"),
    CRUISE(4, "cruise");

    private final int index;
    private final String name;

    OfferType(int index, String name) {
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
