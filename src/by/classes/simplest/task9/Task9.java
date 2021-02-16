package by.classes.simplest.task9;

public class Task9 {
    public static void main(String[] args) {
        BookStorage bookStorage = new BookStorage(5);
        bookStorage.show();
        bookStorage.showAuthor("author3");
        bookStorage.showPublisher("publisher1");
        bookStorage.showAfterYear(1990);
    }
}
