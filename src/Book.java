public class Book {
    double price = 20.00;
    boolean inStock;

    // default constructor
    Book() {
        this.inStock = false;
    }
    // constructor to override
    Book(boolean inStock) {
        this.inStock = inStock;
    }

    public double getPrice() {
        return price;
    }

    public boolean getInStock() {
        return inStock;
    }

    public void toggleStock() {
        this.inStock = !inStock;
    }
}
