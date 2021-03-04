package by.classes.aggregation.task3;

public class State {
    private final City capital = new City();
    private final String name;
    private final int numberOfRegions;
    private final double square;

    private final Region [] regions;

    {
        numberOfRegions = 6;
        regions = new Region[numberOfRegions];
        String [] regs = new String[numberOfRegions];
        String [] caps = {"Brest", "Vitebsk", "Gomel", "Grodno", "Minsk", "Mogilev"};
        for (int i = 0; i < numberOfRegions; i++) {
            regs[i] = caps[i] + " region";
            regions[i] = new Region(regs[i], caps[i]);
        }
        square = 207600;
    }

    public State(String name) {
        this.name = name;
    }

    public String getStateName() {
        return name;
    }

    public void setCapital(String capital) {
        this.capital.setCity(capital);
    }

    public String getCapital() {
        return capital.getCity();
    }

    public int getNumberOfRegions() {
        return numberOfRegions;
    }

    public void showRegions() {
        for (int i = 0; i < numberOfRegions; i++) {
            System.out.println(regions[i].toString());
        }
    }

    public void showCapitalsOfRegions() {
        for (int i = 0; i < numberOfRegions; i++) {
            System.out.println(regions[i].getCapital());
        }
    }

    public double getSquare() {
        return square;
    }
}
