package by.oop.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment(createBasket());
        System.out.println(payment);
    }

    private static ArrayList<Basket> createBasket() {
        ArrayList<Basket> basketList = new ArrayList<>();
        basketList.add(new Basket("ball001", "nike", 2, 50));
        basketList.add(new Basket("t-short007", "mark formele athletic", 1, 15));
        return basketList;
    }
}
