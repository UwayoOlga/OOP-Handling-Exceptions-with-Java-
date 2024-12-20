import java.util.HashMap; //import the HashMap to implement the Map interface
import java.util.Map;// import Map class that defines a collection of key-value pairs

public class ProductCatalog {
    private Map<Integer, Product> catalog;

    public ProductCatalog() {
        catalog = new HashMap<>();
        // Adding some products
        catalog.put(1, new Product(1, "Laptop", 999.99, 10));
        catalog.put(2, new Product(2, "Smartphone", 499.99, 15));
        catalog.put(3, new Product(3, "Headphones", 89.99, 25));
    }

    public Product getProductByID(int productID) {
        // Check if product ID is valid
        if (!catalog.containsKey(productID)) {
            // Throwing an IllegalArgumentException if the product ID is not found in the catalog
            throw new IllegalArgumentException("Product ID " + productID + " not found in catalog.");
        }
        return catalog.get(productID);
    }

    public void addProduct(Product product) {
        // Check if the product is null
        if (product == null) {
            // Throwing an IllegalArgumentException if the product is null
            throw new IllegalArgumentException("Product cannot be null.");
        }
        // Add the product to the catalog
        catalog.put(product.getProductID(), product);
    }
}
