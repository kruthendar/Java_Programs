package week5;

class Car {
    // Attributes (fields)
    String brand;
    String model;
    int year;

    // Constructor to initialize values
    Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    // Method to display car details
    void display() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class Week5_Program1 {
    public static void main(String[] args) {
        // Creating objects
        Car car1 = new Car("Toyota", "Corolla", 2017);
        Car car2 = new Car("Ford", "Mustang", 1965);

        // Calling methods
        car1.display();
        System.out.println();
        car2.display();
    }
}
