package by.classes.simplest.task9;

public class BookStorage {
    private final int quantity;
    private final Book [] books;

    public BookStorage(int quantity) {
        this.quantity = quantity;
        books = initBooks();
    }

    private Book [] initBooks() {
        Book [] books = new Book[quantity];
        for (int i = 0; i < books.length; i++) {
            int id = 100 +(int) (900 * Math.random());
            String title = "title" + i;
            String author = "author" + i;
            String publisher = "publisher" + i;
            int year = 1950 + (int) (70 * Math.random());
            int pages = (int) (750 * Math.random());
            int price = (int) (1000 * Math.random());
            String bindingType = i % 2 == 0 ? "hard" : "soft";
            books[i] = new Book(id, title, author, publisher, year, pages, price, bindingType);
        }
        return books;
    }

    public void show() {
        System.out.println("ID\tTITLE\tAUTHOR\tPUBLISHER\tYEAR\tPAGES\tPRICE\tCOVER");
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void showAuthor(String author) {
        System.out.println("searching for '" + author + "'");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.toString());
            }
        }
    }

    public void showPublisher(String publisher) {
        System.out.println("searching for '" + publisher + "'");
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                System.out.println(book.toString());
            }
        }
    }

    public void showAfterYear(int year) {
        System.out.println("searching for books published after " + year);
        for (Book book : books) {
            if (book.getYear() > year) {
                System.out.println(book.toString());
            }
        }
    }
}
