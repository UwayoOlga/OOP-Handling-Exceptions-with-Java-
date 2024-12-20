public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter for product ID
    public int getId() {
        return id;
    }

    // Getter for product ID with a different method name (getProductID)
    public int getProductID() {
        return id;
    }

    // Getter for product name
    public String getName() {
        return name;
    }

    // Getter for product price
    public double getPrice() {
        return price;
    }

    // Getter for product quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for product quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to update the quantity of the product
    public void updateStock(int quantity) {
        this.quantity -= quantity; // Decrease the stock by the quantity purchased
    }

    // Method to add back stock (if necessary)
    public void restock(int quantity) {
        this.quantity += quantity; // Increase the stock by the restock quantity
    }

    // Method to return all details of the product as a string
    public String getDetails() {
        return String.format("Product Name: %s, Price: $%.2f, Available Quantity: %d", name, price, quantity);
    }
}
