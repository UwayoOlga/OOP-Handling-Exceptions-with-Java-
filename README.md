# Online Shopping Cart
This project demonstrates Java exception handling through practical examples. The goal is to simulate various types of exceptions, 
both checked and unchecked, and implement appropriate exception handling mechanisms.
Here is a brief summary of what each class does along with the exceptions they handle:

1. **Main.java**
   This is the entry point of the application. It handles user input, displays the menu, and interacts with the shopping cart system.
   - **Exceptions Implemented:** `IOException`, `SQLException`, `ArithmeticException`and `InputMismatchException`

2. **ShoppingCart.java**
   This manages the shopping cart, including adding/removing products and calculating the total.
   - **Exceptions Implemented:** `NullPointerException` and `IllegalArgumentException` for invalid operations on cart items.

3. **ProductCatalog.java**
   This class shall manage the product catalog, including loading products from a file or database.
   - **Exceptions Implemented:** `FileNotFoundException` and `IOException` for file-related errors when loading product data.

4. **CartItem.java**
 This class represents an item in the shopping cart, including product details and quantity.
   - **Exceptions Implemented:** `NullPointerException` and `IllegalArgumentException` for invalid cart item operations.
 
5. **Product.java** (No exceptions implemented)
   This class represents a product in the catalog, including its ID, name, price, and available quantity.
   This class doesn't implement exceptions as it's a simple data structure.

 6. **DatabaseHelper.java** (No exceptions implemented)
   This simulates database interactions, such as attempting to connect to a database or simulate a database error.
    moreover, this class may internally handle exceptions but does not throw them to the main application.

 7. **FileHelper.java** (No exceptions implemented)
   The purpose of this class is to Handle reading from and writing to files. It may also simulate file errors but doesn’t explicitly handle
    or throw exceptions within its scope.

### Summary of Exception Usage:
- **Classes with exceptions**: `Main.java`, `ShoppingCart.java`, `ProductCatalog.java`, `CartItem.java`
- **Classes without exceptions**: `Product.java`, `DatabaseHelper.java`, `FileHelper.java`

This overview explains both the system classes and their associated exceptions, as well as the purpose of each class in the system.
