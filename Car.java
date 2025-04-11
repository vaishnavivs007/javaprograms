class Car {
    String model;
    int year;
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public void displayCarInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}
class Owner {
    String name;
    Car car; 
    public Owner(String name, Car car) {
        this.name = name;
        this.car = car;
    }
    public void displayOwnerInfo() {
        System.out.println("Owner Name: " + name);
        car.displayCarInfo(); 
    }
}

public class SimpleProgram {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Corolla", 2020);
        Car car2 = new Car("Honda Civic", 2022);
        Owner owner1 = new Owner("Alice", car1);
        Owner owner2 = new Owner("Bob", car2);

        owner1.displayOwnerInfo();
        System.out.println();
        owner2.displayOwnerInfo();
    }
}
