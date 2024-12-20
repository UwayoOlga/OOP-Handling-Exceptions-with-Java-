import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> cartItems; //  This field holds the list of CartItem objects, which represent the items added to the shopping cart.

    public ShoppingCart() { // the constructor of the ShoppingCart class
        this.cartItems = new ArrayList<>();
    }
/*If the product passed to the method is null, an IllegalArgumentException is thrown with the message
"Product cannot be null".
and If the quantity is less than or equal to zero, an IllegalArgumentException is thrown with the message
"Quantity must be greater than zero".
*/
    public void addToCart(Product product, int quantity) {
        try {
            if (product == null) {
                throw new IllegalArgumentException("Product cannot be null");
            }
            if (quantity <= 0) {
                throw new IllegalArgumentException("Quantity must be greater than zero");
            }
            product.updateStock(quantity); // Decrease stock
            cartItems.add(new CartItem(product, quantity));
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding to cart: " + e.getMessage());
        }
    }
// the below method uses removeIf to find and remove the item from the list where the product matches the one in the CartItem
    public void removeFromCart(Product product) {
        cartItems.removeIf(item -> item.getProduct().equals(product));
    }
//This method displays the contents of the cart. If the cart is empty, it prints a message stating "Your cart is empty."
// Otherwise, it loops through the cartItems list and prints the item details.
    public void viewCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            for (CartItem item : cartItems) {
                System.out.println(item.getItemDetails());
            }
        }
    }
/*calculateTotal():

This method calculates the total price of the items in the cart by looping through each CartItem
and summing the total price of the items. This method doesn't handle exceptions but could potentially throw
an exception if item.getItemTotal() is invalid or results in an error, though it's unlikely unless there is
an issue with the CartItem class.*/
    public double calculateTotal() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getItemTotal();
        }
        return total;
    }

    public void clearCart() {//This method clears all items in the cart by calling cartItems.clear().
        cartItems.clear();
    }
}
