package by.classes.aggregation.task2;

// Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford");
        car.ride();
        car.refuel();
        car.changeAWheel();
        car.changeAWheel(195, 65, 13);
        System.out.println(car.getBrand());
        System.out.println(car.toString());
    }
}
