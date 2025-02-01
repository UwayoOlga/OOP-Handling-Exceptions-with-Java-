package Abstraction;

interface Drawable {
    void draw(); 
    String DEFAULT_COLOR = "BLACK"; 
}

interface Resizable {
    void resize(int percentage); 
}

class Circle implements Drawable, Resizable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    @Override
    public void resize(int percentage) {
        this.radius = radius * (1 + percentage / 100.0);
    }
}

