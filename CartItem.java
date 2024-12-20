public class CartItem {
    private Product product;
    private int quantity;
/* IllegalArgumentException is thrown if the product parameter is null.
 This ensures that a CartItem cannot be created without a valid product.
 If product is null, an exception is thrown with the message "Product cannot be null". */
    public CartItem(Product product, int quantity) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getItemTotal() {
        return product.getPrice() * quantity;
    }

    public String getItemDetails() {
        return product.getDetails() + ", Quantity: " + quantity + ", Total: $" + getItemTotal();
    }
}
