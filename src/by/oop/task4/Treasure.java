package by.oop.task4;

public class Treasure {
    private final int cost;

    public Treasure(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "cost=" + cost +
                '}';
    }
}
