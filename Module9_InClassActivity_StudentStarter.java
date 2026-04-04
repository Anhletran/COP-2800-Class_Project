public class Module9_InClassActivity_StudentStarter {
    public static void main(String[] args) {
        // TODO 1: Create a Car object with brand "Toyota" and 4 doors
        Car myCar = new Car("Toyota", 4);

        // TODO 2: Call the displayDetails() method for the Car object
        System.out.println("=== Car Details ===");
        myCar.displayDetails();
        System.out.println();

        // TODO 3: Create a Truck object with brand "Ford" and payload capacity 2000
        Truck myTruck = new Truck("Ford", 2000);

        // TODO 4: Call the displayDetails() method for the Truck object
        System.out.println("=== Truck Details ===");
        myTruck.displayDetails();
        System.out.println();

        // TODO 5: Create an ElectricCar object with brand "Tesla", 4 doors, and 100 kWh battery capacity
        ElectricCar myElectricCar = new ElectricCar("Tesla", 4, 100);

        // TODO 6: Call the displayDetails() method for the ElectricCar object
        System.out.println("=== Electric Car Details ===");
        myElectricCar.displayDetails();

        // TODO 7: Call the chargeBattery() method for the ElectricCar object
        myElectricCar.chargeBattery();
        System.out.println();

        // TODO 8: Demonstrate polymorphism by storing the ElectricCar object
        // in a Vehicle reference and calling displayBrand()
        System.out.println("=== Polymorphism Demo ===");
        Vehicle polyVehicle = myElectricCar;
        polyVehicle.displayBrand();
    }
}

// TODO 9: Create the Vehicle class
class Vehicle {
    // TODO 10: Declare a protected String variable named brand
    protected String brand;

    // TODO 11: Write a constructor that accepts brand
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // TODO 12: Write a method named displayBrand()
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// TODO 13: Create the Car class so it extends Vehicle
class Car extends Vehicle {
    // TODO 14: Declare a private int variable named numberOfDoors
    private int numberOfDoors;

    // TODO 15: Write a constructor that accepts brand and numberOfDoors
    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    // TODO 16: Write a method named displayDetails()
    public void displayDetails() {
        displayBrand();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// TODO 17: Create the Truck class so it extends Vehicle
class Truck extends Vehicle {
    // TODO 18: Declare a private int variable named payloadCapacity
    private int payloadCapacity;

    // TODO 19: Write a constructor that accepts brand and payloadCapacity
    public Truck(String brand, int payloadCapacity) {
        super(brand);
        this.payloadCapacity = payloadCapacity;
    }

    // TODO 20: Write a method named displayDetails()
    public void displayDetails() {
        displayBrand();
        System.out.println("Payload Capacity: " + payloadCapacity + " lbs");
    }
}

// TODO 21: Create the Electric interface
interface Electric {
    // TODO 22: Declare the method chargeBattery()
    void chargeBattery();
}

// TODO 23: Create the ElectricCar class so it extends Car and implements Electric
class ElectricCar extends Car implements Electric {
    // TODO 24: Declare a private int variable named batteryCapacity
    private int batteryCapacity;

    // TODO 25: Write a constructor that accepts brand, numberOfDoors, and batteryCapacity
    public ElectricCar(String brand, int numberOfDoors, int batteryCapacity) {
        super(brand, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
    }

    // TODO 26: Override chargeBattery()
    @Override
    public void chargeBattery() {
        System.out.println("Charging the battery with capacity: " + batteryCapacity + " kWh.");
    }

    // TODO 27: Override displayDetails()
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}