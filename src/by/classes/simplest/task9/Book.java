package by.classes.simplest.task9;

public class Book {
    private final int id;
    private final String title;
    private final String author;
    private final String publisher;
    private final int year;
    private final int pages;
    private final int price;
    private final String cover;

    public Book(int id, String title, String author, String publisher, int year, int pages, int price,
                String cover) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.cover = cover;
    }

    public String toString() {
        return id + "\t" + title + "\t" + author + "\t" + publisher + "\t" + year + "\t" + pages + "\t\t" + price +
                "\t\t" + cover;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public int getPrice() {
        return price;
    }

    public String getCover() {
        return cover;
    }
}
