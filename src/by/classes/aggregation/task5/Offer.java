package by.classes.aggregation.task5;

public class Offer {
    private final OfferType type;
    private final OfferTransport transport;
    private final OfferMeals meals;
    private final int days;

    public Offer(OfferType type, OfferTransport transport, OfferMeals meals, int days) {
        this.type = type;
        this.transport = transport;
        this.meals = meals;
        this.days = days;
    }

    public OfferType getType() {
        return type;
    }

    public OfferTransport getTransport() {
        return transport;
    }

    public OfferMeals getMeals() {
        return meals;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        return getType() + " by " + getTransport() + " " + getMeals() +
                " for " + getDays() + " days";
    }
}
