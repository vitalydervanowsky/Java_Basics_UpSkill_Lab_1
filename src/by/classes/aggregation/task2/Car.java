package by.classes.aggregation.task2;

public class Car {
    private final String brand;
    private final Engine engine = new Engine("DuratecHE", 1997, 145);
    private Wheel wheel = new Wheel(205, 55, 16);

    public Car(String brand) {
        this.brand = brand;
    }

    public void ride() {
        System.out.println(brand + " rides on the road");
    }

    public void refuel() {
        System.out.println(brand + " stopped at a gas station to refuel");
    }

    public void changeAWheel() {
        System.out.print(brand + " stopped to change wheels from " + wheel.toString());
        wheel.setWidth(wheel.getWidth() + 10);
        wheel.setHeight(wheel.getHeight() - 10);
        wheel.setDiameter(wheel.getDiameter() + 1);
        System.out.println(" to " + wheel.toString());
    }

    public void changeAWheel(int width, int height, int diameter) {
        System.out.print(brand + " stopped to change wheels from " + wheel.toString());
        this.wheel = new Wheel(width, height, diameter);
        System.out.println(" to " + wheel.toString());
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return brand + " with engine " + engine.toString() + " on " + wheel.toString() + " wheels";
    }
}
