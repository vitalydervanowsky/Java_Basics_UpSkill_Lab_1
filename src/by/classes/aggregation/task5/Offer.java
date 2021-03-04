package by.classes.aggregation.task5;

public class Offer {
    private final int type;
    private final int transport;
    private final int meals;
    private final int days;

    public Offer() {
        type = 0;
        transport = 0;
        meals = 0;
        days = 0;
    }

    public Offer(int type, int transport, int meals, int days) {
        this.type = type;
        this.transport = transport;
        this.meals = meals;
        this.days = days;
    }

    public String getOfferType() {
        switch (type) {
            case 0: return "relaxation";
            case 1: return "excursion";
            case 2: return "treatment";
            case 3: return "shopping";
            case 4: return "cruise";
            default: return "";
        }
    }

    public String getTransportType() {
        switch (getTransport()) {
            case 0: return "plane";
            case 1: return "bus";
            case 2: return "railway";
            case 3: return "helicopter";
            case 4: return "ship";
            default: return "";
        }
    }

    public String getMealsType() {
        if (meals == 0) {
            return "without meals";
        } else {
            return "with meals";
        }
    }

    public int getDays() {
        return days;
    }

    public int getType() {
        return type;
    }

    public int getTransport() {
        return transport;
    }

    public int getMeals() {
        return meals;
    }

    @Override
    public String toString() {
        return getOfferType() + " by " + getTransportType() + " " + getMealsType() +
                " for " + getDays() + " days";
    }
}
