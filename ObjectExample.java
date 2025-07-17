// Define a Class
class Car {
    // Attributes (data members)
    String brand;
    String model;
    int year;

    // Constructor to initialize the object
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method (behavior)
    public void start() {
        System.out.println(brand + " " + model + " is starting.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}

// Main class to create and use objects
public class ObjectExample {
    public static void main(String[] args) {
        // Create an object (instance) of the Car class
        Car myCar = new Car("Toyota", "Camry", 2023);

        // Access attributes of the object
        System.out.println("My car's brand: " + myCar.brand);
        System.out.println("My car's model: " + myCar.model);

        // Call methods of the object
        myCar.start();
        myCar.displayInfo();

        // Create another object of the Car class
        Car anotherCar = new Car("Honda", "Civic", 2024);
        anotherCar.displayInfo();
    }
}