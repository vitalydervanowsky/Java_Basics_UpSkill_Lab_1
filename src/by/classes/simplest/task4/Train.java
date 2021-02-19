package by.classes.simplest.task4;

public class Train {
    private String destination;
    private int trainNumber;
    private int time;

    public Train(String destination, int trainNumber, int time) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public int getTime() {
        return time;
    }

    public String getTimeInHours() {
        int hours = this.time / 60;
        int minutes = this.time - hours * 60;
        String result;
        if (minutes < 10) {
            result = hours + ":0" + minutes;
        } else {
            result = hours + ":" + minutes;
        }
        return result;
    }

    public void setTime(int minutes) {
        this.time = minutes;
    }
}
