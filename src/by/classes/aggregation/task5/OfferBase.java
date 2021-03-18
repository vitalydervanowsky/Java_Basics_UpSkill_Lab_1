package by.classes.aggregation.task5;

import java.util.ArrayList;

public class OfferBase {
    private int quantity;
    private ArrayList<Offer> offers;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ArrayList<Offer> getOffers() {
        return offers;
    }

    public void setOffers(ArrayList<Offer> offers) {
        this.offers = offers;
    }
}
