package by.oop.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment(createProductList());
        System.out.println(payment);
    }

    private static ArrayList<Product> createProductList() {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product("ball001", "nike", 2, 50));
        productList.add(new Product("t-short007", "mark formele athletic", 1, 15));
        return productList;
    }
}
