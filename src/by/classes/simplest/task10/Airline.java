package by.classes.simplest.task10;

public class Airline {
    private final String destination;
    private final int flightNumber;
    private final String planeType;
    private final int time;
    private final byte dayOfWeek;

    public Airline(String destination, int flightNumber, String planeType, int time, byte dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.time = time;
        this.dayOfWeek = dayOfWeek;
    }

    public String toString() {
        Time time = new Time(this.time);
        return "destination='" + destination + '\'' +
                "\tflightNumber=" + flightNumber +
                "\tplaneType='" + planeType + '\'' +
                "\ttime='" + time.toString() + '\'' +
                "\tdayOfWeek=" + dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getPlaneType() {
        return planeType;
    }

    public int getTime() {
        return time;
    }

    public byte getDayOfWeek() {
        return dayOfWeek;
    }
}
