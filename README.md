# Online Shopping Cart
This project demonstrates Java exception handling through practical examples. The goal is to simulate various types of exceptions, 
both checked and unchecked, and implement appropriate exception handling mechanisms.
Here is a brief summary of what each class does along with the exceptions they handle:

1. **Main.java**
   This is the entry point of the application. It handles user input, displays the menu, and interacts with the shopping cart system.
   - **Exceptions Implemented:** 
     - `IOException`: For file-related errors in file operations.
     - `SQLException`: For simulating database connection errors.
     - `InputMismatchException`: For handling invalid user input when numeric values are expected.
     - `ClassNotFoundException`: For simulating missing class errors at runtime.

2. **ShoppingCart.java**
   This manages the shopping cart, including adding/removing products and calculating the total.
   - **Exceptions Implemented:** 
     - `NullPointerException`: For invalid operations on null cart items.
     - `IllegalArgumentException`: For invalid operations such as adding an invalid quantity or product.

3. **CartItem.java**
   This class represents an item in the shopping cart, including product details and quantity.
   - **Exceptions Implemented:** 
     - `NullPointerException`: For operations involving null products.
     - `IllegalArgumentException`: For invalid quantities when creating or modifying a cart item.

4. **Product.java** 
   This class represents a product in the catalog, including its ID, name, price, and available quantity.
   - **Exceptions Implemented:** No exceptions are implemented as this class is primarily a data structure.

5. **DatabaseHelper.java**
   This class simulates database interactions, such as attempting to connect to a database or handling database errors.
   - **Exceptions Implemented:** 
     - `SQLException`: For simulating database connection issues.
     - `ClassNotFoundException`: For simulating missing classes during database operations.
     - `ClassCastException`: For attempting invalid type conversions.

6. **FileHelper.java**
   The purpose of this class is to handle reading from and writing to files, as well as simulating file-related errors.
   - **Exceptions Implemented:** 
     - `FileNotFoundException`: For cases when a file cannot be found.
     - `IOException`: For issues while reading from or writing to a file.
     - `EOFException`: For simulating unexpected end-of-file errors.

### Summary of Exception Usage:
- **Classes with exceptions**: `Main.java`, `ShoppingCart.java`, `CartItem.java`, `DatabaseHelper.java`, `FileHelper.java`
- **Classes without exceptions**: `Product.java`

This overview explains both the system classes and their associated exceptions, as well as the purpose of each class in the system.
