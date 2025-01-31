 class Vehicle { 
    private String brand;
    private String model;
    private int year;
 
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
 
    public String getBrand() {
        return brand;
    }
 
    public void setBrand(String brand) {
        this.brand = brand;
    }
 
    public String getModel() {
        return model;
    }
 
    public void setModel(String model) {
        this.model = model;
    }
 
    public int getYear() {
        return year;
    }
 
    public void setYear(int year) {
        if (year > 1885) {   
            this.year = year;
        } else {
            System.out.println("Invalid year.");
        }
    } 
    public void displayInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
    }
}
 
class Car extends Vehicle { 
    private int numberOfDoors;
 
    public Car(String brand, String model, int year, int numberOfDoors) { 
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }
 
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
 
    public void setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors > 0) {
            this.numberOfDoors = numberOfDoors;
        } else {
            System.out.println("Invalid number of doors.");
        }
    }
 
    @Override
    public void displayInfo() {
        super.displayInfo();  
        System.out.println("Number of Doors: " + getNumberOfDoors());
    }
}
  