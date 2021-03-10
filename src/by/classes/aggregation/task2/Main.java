package by.classes.aggregation.task2;

// Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("DuratecHE", 1997, 145);
        Wheel wheel = new Wheel(205, 55, 16);
        Car car = new Car(engine, wheel);
        car.setBrand("Ford");
        System.out.println("My new car is " + car.getBrand());
        car.ride();
        car.refuel();
        Wheel newWheel = new Wheel(195, 65, 13);
        car.changeAWheel(newWheel);
        System.out.println(car.toString());
    }
}
