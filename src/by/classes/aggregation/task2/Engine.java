package by.classes.aggregation.task2;

public class Engine {
    private final String manufacture;
    private final int volume;
    private final int power;

    public Engine(String manufacture, int volume, int power) {
        this.manufacture = manufacture;
        this.volume = volume;
        this.power = power;
    }

    @Override
    public String toString() {
        return manufacture + " " + volume + "cm3 with " + power + " HP";
    }
}
