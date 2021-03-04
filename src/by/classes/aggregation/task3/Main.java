package by.classes.aggregation.task3;

// Создать объект класса Государство, используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

public class Main {
    public static void main(String[] args) {
        State state = new State("Belarus");
        state.setCapital("Minsk");
        System.out.println("The capital of " + state.getStateName() + " is " + state.getCapital());
        System.out.println("There are " + state.getNumberOfRegions() + " regions");
        state.showRegions();
        state.showCapitalsOfRegions();
        System.out.println("Total area is " + state.getSquare() + " km2");
    }
}
