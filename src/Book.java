public class Book {
    double price;



    boolean inStock;

    Book() {
        this.price = 20.00;
        this.inStock = false;
    }

    Book(boolean inStock) {
        this.price = 20.00;
        this.inStock = inStock;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
