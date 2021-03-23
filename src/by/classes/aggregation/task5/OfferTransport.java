package by.classes.aggregation.task5;

public enum OfferTransport {
    PLANE(0, "plane"),
    BUS(1, "bus"),
    RAILWAY(2, "railway"),
    HELICOPTER(3, "helicopter"),
    SHIP(4, "ship");

    private final int index;
    private final String name;

    OfferTransport(int index, String name) {
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
