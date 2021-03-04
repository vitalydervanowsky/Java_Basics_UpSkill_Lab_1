package by.classes.aggregation.task5;

public class OfferBase {
    private final int quantity;
    private final Offer[] offer;

    public OfferBase(int quantity) {
        this.quantity = quantity;
        offer = new Offer[this.quantity];
        for (int i = 0; i < offer.length; i++) {
            offer[i] = new Offer(r(5), r(5), r(2), (2 + r(12)));
        }
    }

    private int r(int i) {
        return (int)(i * Math.random());
    }

    public void showOffers() {
        for (int i = 0; i < quantity; i++) {
            System.out.println(offer[i].toString());
        }
    }

    public void showOffersWithType(int type) {
        String t;
        switch (type) {
            case 0:
                t = "relaxation";
                break;
            case 1:
                t = "excursion";
                break;
            case 2:
                t = "treatment";
                break;
            case 3:
                t = "shopping";
                break;
            case 4:
                t = "cruise";
                break;
            default: t = "";
        }
        System.out.println("> Searching for offers with type " + t);
        for (int i = 0; i < quantity; i++) {
            if (offer[i].getType() == type) {
                System.out.println(offer[i].toString());
            }
        }

    }

    public void showOffersWithTransport(int transport) {
        String t;
        switch (transport) {
            case 0:
                t = "plane";
                break;
            case 1:
                t = "bus";
                break;
            case 2:
                t = "railway";
                break;
            case 3:
                t = "helicopter";
                break;
            case 4:
                t = "ship";
                break;
            default: t = "";
        }
        System.out.println("> Searching for offers with transport " + t);
        for (int i = 0; i < quantity; i++) {
            if (offer[i].getTransport() == transport) {
                System.out.println(offer[i].toString());
            }
        }
    }

    public void showOffersWithMeals(int meals) {
        String m;
        if (meals == 0) {
            m = "without";
        } else {
            m = "with";
        }
        System.out.println("> Searching for offers " + m + " meals");
        for (int i = 0; i < quantity; i++) {
            if (offer[i].getMeals() == meals) {
                System.out.println(offer[i].toString());
            }
        }
    }

    public void showOffersDuringFor(int days) {
        System.out.println("> Searching for offers with duration " + days);
        for (int i = 0; i < quantity; i++) {
            if (offer[i].getDays() == days) {
                System.out.println(offer[i].toString());
            }
        }
    }

    public void sortOffersByType() {
        System.out.println("> Sorting offers by type");
        for (int i = 0; i < quantity; i++) {
            for (int j = 0; j < quantity; j++) {
                if (offer[i].getType() < offer[j].getType()) {
                    swap(offer, i, j);
                }
            }
        }
        showOffers();
    }

    public void sortOffersByTransport() {
        System.out.println("> Sorting offers by transport");
        for (int i = 0; i < quantity; i++) {
            for (int j = 0; j < quantity; j++) {
                if (offer[i].getTransport() < offer[j].getTransport()) {
                    swap(offer, i, j);
                }
            }
        }
        showOffers();
    }

    public void sortOffersByMeals() {
        System.out.println("> Sorting offers by meals");
        for (int i = 0; i < quantity; i++) {
            for (int j = 0; j < quantity; j++) {
                if (offer[i].getMeals() < offer[j].getMeals()) {
                    swap(offer, i, j);
                }
            }
        }
        showOffers();
    }

    public void sortOffersByDays() {
        System.out.println("> Sorting offers by days");
        for (int i = 0; i < quantity; i++) {
            for (int j = 0; j < quantity; j++) {
                if (offer[i].getDays() < offer[j].getDays()) {
                    swap(offer, i, j);
                }
            }
        }
        showOffers();
    }

    private static <A> void swap(A[] a, int i, int j) {
        A temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
