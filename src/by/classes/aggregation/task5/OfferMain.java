package by.classes.aggregation.task5;

// Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
// различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

import java.util.ArrayList;

public class OfferMain {
    public static void main(String[] args) {
        OfferBase offerBase = createBase(5);
        print(offerBase);

        printOffersWithType(offerBase, 0);
        printOffersWithTransport(offerBase, 0);
        printOffersWithMeals(offerBase, 1);
        printOffersDuringForMore(offerBase, 10);

        sortOffersByType(offerBase);
        print(offerBase);
        sortOffersByTransport(offerBase);
        print(offerBase);
        sortOffersByMeals(offerBase);
        print(offerBase);
        sortOffersByDays(offerBase);
        print(offerBase);
    }

    private static OfferBase createBase(int quantity) {
        ArrayList<Offer> offers = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            Offer offer = new Offer(OfferType.values()[r(5)],
                    OfferTransport.values()[r(5)],
                    OfferMeals.values()[r(2)],
                    (2 + r(12)));
            offers.add(offer);
        }
        return new OfferBase(offers);
    }

    private static int r(int i) {
        return (int)(i * Math.random());
    }

    private static void print(OfferBase offerBase) {
        System.out.println("> list of offers");
        ArrayList<Offer> offers = offerBase.getOffers();
        for (Offer offer : offers) {
            System.out.println(offer);
        }
        System.out.println();
    }

    private static void printOffersWithType(OfferBase offerBase, int type) {
        System.out.println("> searching offers for type = " + OfferType.values()[type]);
        for (Offer offer : offerBase.getOffers()) {
            if (offer.getType().getIndex() == type) {
                System.out.println(offer.toString());
            }
        }
        System.out.println();
    }

    private static void printOffersWithTransport(OfferBase offerBase, int transport) {
        System.out.println("> searching offers for transport = " + OfferTransport.values()[transport]);
        for (Offer offer : offerBase.getOffers()) {
            if (offer.getTransport().getIndex() == transport) {
                System.out.println(offer.toString());
            }
        }
        System.out.println();
    }

    private static void printOffersWithMeals(OfferBase offerBase, int meals) {
        System.out.println("> searching offers for meals = " + OfferMeals.values()[meals]);
        for (Offer offer : offerBase.getOffers()) {
            if (offer.getMeals().getIndex() == meals) {
                System.out.println(offer.toString());
            }
        }
        System.out.println();
    }

    private static void printOffersDuringForMore(OfferBase offerBase, int days) {
        System.out.println("> searching offers during for more = " + days);
        for (Offer offer : offerBase.getOffers()) {
            if (offer.getDays() >= days) {
                System.out.println(offer.toString());
            }
        }
        System.out.println();
    }

    private static void sortOffersByType(OfferBase offerBase) {
        ArrayList<Offer> offers = offerBase.getOffers();
        System.out.println("> Sorting offers by type");
        offers.sort(new OfferTypeComparator());
        offerBase.setOffers(offers);
    }

    private static void sortOffersByTransport(OfferBase offerBase) {
        ArrayList<Offer> offers = offerBase.getOffers();
        System.out.println("> Sorting offers by transport");
        offers.sort(new OfferTransportComparator());
        offerBase.setOffers(offers);
    }

    private static void sortOffersByMeals(OfferBase offerBase) {
        ArrayList<Offer> offers = offerBase.getOffers();
        System.out.println("> Sorting offers by meals");
        offers.sort(new OfferMealsComparator());
        offerBase.setOffers(offers);
    }

    private static void sortOffersByDays(OfferBase offerBase) {
        ArrayList<Offer> offers = offerBase.getOffers();
        System.out.println("> Sorting offers by days");
        offers.sort(new OfferDaysComparator());
        offerBase.setOffers(offers);
    }
}
