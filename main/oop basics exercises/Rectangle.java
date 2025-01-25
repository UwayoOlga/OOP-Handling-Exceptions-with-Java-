/* Write a Java program to create a class called "Rectangle" with width and height attributes.
 Include methods to initialize attributes, calculate the area and perimeter, and display results */
 public class Rectangle {
    private double width;
    private double height;

    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public void display() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setDimensions(5, 10);
        rect.display();
    }
}

