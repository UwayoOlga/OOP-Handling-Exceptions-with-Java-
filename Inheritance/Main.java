package Inheritance;
 
class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {  
        return 0;  
    }

    public String toString() {
        return "Shape (Color: " + color + ")";
    }
}
 
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);  
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override   
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle (" + super.toString() + ", Radius: " + radius + ")";
    }
}
 
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle (" + super.toString() + ", Length: " + length + ", Width: " + width + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle("red", 5);
        Rectangle myRectangle = new Rectangle("blue", 10, 5);

        System.out.println(myCircle);        
        System.out.println("Circle Area: " + myCircle.getArea());  

        System.out.println(myRectangle);     
        System.out.println("Rectangle Area: " + myRectangle.getArea());  

        Shape aShape = myCircle;   
        System.out.println(aShape.getColor()); 
        System.out.println(aShape.getArea());    

    }
}