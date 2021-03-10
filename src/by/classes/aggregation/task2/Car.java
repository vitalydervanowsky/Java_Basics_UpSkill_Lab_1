package by.classes.aggregation.task2;

public class Car {
    private String brand = "brand";
    private final Engine engine;
    private Wheel wheel;

    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public void ride() {
        System.out.println(getBrand() + " rides on the road");
    }

    public void refuel() {
        System.out.println(getBrand() + " stopped at a gas station to refuel");
    }

    public void changeAWheel(Wheel wheel) {
        System.out.print(getBrand() + " stopped to change wheels from " + this.wheel.toString());
        this.wheel = wheel;
        System.out.println(" to " + this.wheel.toString());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return getBrand() + " has an engine " + engine.toString() + " on " + wheel.toString() + " wheels";
    }
}
