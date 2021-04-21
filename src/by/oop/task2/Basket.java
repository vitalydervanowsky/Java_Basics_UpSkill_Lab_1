package by.oop.task2;

public class Basket {
    private final String article;
    private final String title;
    private final int quantity;
    private final int price;

    public Basket(String article, String title, int quantity, int price) {
        this.article = article;
        this.title = title;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
