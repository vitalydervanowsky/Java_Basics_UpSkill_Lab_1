package by.oop.task2;

import java.util.ArrayList;
import java.util.Date;

public class Payment {
    private final Date date;
    private final int total;

    public Payment(ArrayList<Basket> basketList) {
        this.date = new Date();
        int total = 0;
        for (Basket basket : basketList) {
            total += basket.getQuantity() * basket.getPrice();
        }
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "date=" + getDate() +
                ", total=" + getTotal() +
                '}';
    }
}
