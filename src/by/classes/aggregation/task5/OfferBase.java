package by.classes.aggregation.task5;

import java.util.ArrayList;

public class OfferBase {
    private ArrayList<Offer> offers;

    public OfferBase(ArrayList<Offer> offers) {
        this.offers = offers;
    }

    public ArrayList<Offer> getOffers() {
        return offers;
    }

    public void setOffers(ArrayList<Offer> offers) {
        this.offers = offers;
    }
}
