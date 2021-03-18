package by.classes.aggregation.task5;

import java.util.Comparator;

public class OfferDaysComparator implements Comparator<Offer> {

    @Override
    public int compare(Offer offer1, Offer offer2) {
        Integer number1 = offer1.getDays();
        Integer number2 = offer2.getDays();
        return number1.compareTo(number2);
    }
}
