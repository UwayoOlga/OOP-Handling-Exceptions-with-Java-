import java.util.Scanner; // import the Scanner class which is used to get user input
import java.sql.SQLException; // import the SQLException class that shall signal that an error has occurred while accessing a database.
import java.util.InputMismatchException;// import InputMismatchException class for handling situations where user
// input doesn't match the expected data type.
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        // Create some sample products
        Product product1 = new Product(1, "Laptop", 999.99, 10);
        Product product2 = new Product(2, "Smartphone", 499.99, 15);
        Product product3 = new Product(3, "Headphones", 89.99, 25);

        // Create helper instances
        DatabaseHelper dbHelper = new DatabaseHelper();
        FileHelper fileHelper = new FileHelper();

        // Main Menu
        System.out.println("Welcome to the Shopping Cart System!");
        while (true) {
            System.out.println("\n1. View Cart");
            System.out.println("2. Add Item to Cart");
            System.out.println("3. Remove Item from Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Simulate Database Error");
            System.out.println("6. Simulate File Error");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int option = 0;
            boolean validOption = false;

            // Input validation for option selection by Initializing variables to store the user's option
            // and a flag for validating input.
            while (!validOption) {
                try {
                    option = scanner.nextInt();
                    validOption = true;  // If no exception, exit loop
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine();  // Clear the invalid input
                }
            }
/* on this block we use a while loop to handle invalid input for selecting a menu option.
If the user enters something other than an integer, an InputMismatchException is caught
and prompts the user to enter a valid number. */
            switch (option) {
                case 1:
                    cart.viewCart();
                    break;

                case 2:
                    int id = 0;
                    int quantity = 0;
                    boolean validInput = false;

                    // Handle invalid product ID and quantity inputs
                    while (!validInput) {
                        try {
                            // Display product information (ID, price, quantity)
                            System.out.println("Enter product ID to add:");
                            System.out.println("1: Laptop - $" + product1.getPrice() + " - Available: " + product1.getQuantity());
                            System.out.println("2: Smartphone - $" + product2.getPrice() + " - Available: " + product2.getQuantity());
                            System.out.println("3: Headphones - $" + product3.getPrice() + " - Available: " + product3.getQuantity());
                            System.out.print("Choose product ID (1, 2, or 3): ");
                            id = scanner.nextInt();
                            System.out.print("Enter quantity: ");
                            quantity = scanner.nextInt();
                            validInput = true;  // If no exception, exit loop

                            // Check if the product ID is valid
                            if (id == 1) {
                                cart.addToCart(product1, quantity);
                            } else if (id == 2) {
                                cart.addToCart(product2, quantity);
                            } else if (id == 3) {
                                cart.addToCart(product3, quantity);
                            } else {
                                System.out.println("Invalid product ID. Please choose 1, 2, or 3.");
                                validInput = false;  // Invalid product ID, ask again
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter valid numbers for product ID and quantity.");
                            scanner.nextLine();  // Clear the invalid input
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter product ID to remove (1: Laptop, 2: Smartphone, 3: Headphones): ");
                    int removeId = scanner.nextInt();
                    if (removeId == 1) {
                        cart.removeFromCart(product1);
                    } else if (removeId == 2) {
                        cart.removeFromCart(product2);
                    } else if (removeId == 3) {
                        cart.removeFromCart(product3);
                    }
                    break;

                case 4:
                    System.out.println("Checkout: Total Amount: $" + cart.calculateTotal());
                    cart.clearCart();
                    break;

                case 5: /* In this case, the user selects option 5 to simulate a database error.
The simulateDatabaseError() method of the DatabaseHelper class is called inside a try block.
If an error occurs while simulating the database operation (for example, a SQL issue), an SQLException is thrown.
The catch block catches the SQLException, and its error message is printed to the console using e.getMessage()*/
                    try {
                        dbHelper.simulateDatabaseError();
                    } catch (SQLException e) {
                        System.out.println("Database Error: " + e.getMessage());
                    }
                    break;

                case 6: /* When the user selects option 6, the program tries to load the contents of a
                     non-existent file. The IOException occurs because the file cannot be found,
                     and it's typically handled in the loadCartFromFile method, which is responsible for file reading operations.*/
                    fileHelper.loadCartFromFile("non_existent_file.txt");
                    break;

                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default://If the user enters an invalid option, a message is displayed, and the loop continues for another input.
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
