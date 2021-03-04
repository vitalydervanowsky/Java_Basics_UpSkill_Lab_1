package by.classes.aggregation.task5;

// Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
// различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

public class TravelBase {
    public static void main(String[] args) {
        OfferBase ob = new OfferBase(6);
        ob.showOffers();

        ob.showOffersWithType(0);
        ob.showOffersWithTransport(0);
        ob.showOffersWithMeals(1);
        ob.showOffersDuringFor(10);

        ob.sortOffersByType();
        ob.sortOffersByTransport();
        ob.sortOffersByMeals();
        ob.sortOffersByDays();
    }
}
