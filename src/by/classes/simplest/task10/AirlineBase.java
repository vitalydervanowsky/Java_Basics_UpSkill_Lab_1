package by.classes.simplest.task10;

public class AirlineBase {
    private final int quantity;
    private final Airline [] airlines;

    public AirlineBase(int quantity) {
        this.quantity = quantity;
        airlines = initAirlines();
    }

    private Airline[] initAirlines() {
        Airline [] airlines = new Airline[quantity];
        String [] cities = {"Moscow", "Berlin", "London", "Warsaw", "Prague"};
        String [] planes = {"777X", "A320", "737-600", "A380", "Tu-144"};
        byte [] days = {1, 4, 2, 4, 3};
        for (int i = 0; i < airlines.length; i++) {
            String destination = "Moscow";
            int flightNumber = 245 + i;
            String planeType = "A37" + i;
            int time = (int) (1440 * Math.random());
            byte dayOfWeek = (byte) (7 - i);
            if (quantity == cities.length) {
                destination = cities[i];
                planeType = planes[i];
                dayOfWeek = days[i];
            }
            airlines[i] = new Airline(destination, flightNumber, planeType, time, dayOfWeek);
        }
        return airlines;
    }

    public void show() {
        for (Airline airline : airlines) {
            System.out.println(airline.toString());
        }
    }

    public void showToDestination(String destination) {
        System.out.println("searching airlines to " + destination);
        for (Airline airline : airlines) {
            if (airline.getDestination().equals(destination)) {
                System.out.println(airline.toString());
            }
        }
    }

    public void showAtDay(int day) {
        System.out.println("searching airlines at day " + day);
        for (Airline airline : airlines) {
            if (airline.getDayOfWeek() == day) {
                System.out.println(airline.toString());
            }
        }
    }

    public void showAtDayAndTime(int day, int minutes) {
        Time t = new Time(minutes);
        System.out.println("searching airlines at day " + day + " and time after " + t.toString());
        for (Airline airline : airlines) {
            if (airline.getDayOfWeek() == day && airline.getTime() > minutes) {
                System.out.println(airline.toString());
            }
        }
    }
}
