import java.util.ArrayList;

public class BookStore {
    public static void main(String[] args) {
        Book book1 = new Book(); // default
        Book book2 = new Book(true); // set to true
        Book book3 = new Book(); //default
        Book book4 = new Book(true); // set to true
        Book book5 = new Book(); // default
        book5.toggleStock(); // default changed to true
        Book[] bookList = {book1, book2, book3, book4, book5};

        System.out.printf("Your total is: $%.2f.\n", getTotalPrice(bookList));
    }

    public static double getTotalPrice(Book[] listOfBooks) {
        double sum = 0.00;
        for (Book book : listOfBooks) {
            if (book.getInStock()) {
                sum += book.getPrice();
            }
        }
        return sum;
    }
}
