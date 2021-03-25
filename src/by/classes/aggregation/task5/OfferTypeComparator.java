package by.classes.aggregation.task5;

import java.util.Comparator;

public class OfferTypeComparator implements Comparator<Offer> {

    @Override
    public int compare(Offer offer1, Offer offer2) {
        Integer number1 = offer1.getType().getIndex();
        Integer number2 = offer2.getType().getIndex();
        return number1.compareTo(number2);
    }
}
