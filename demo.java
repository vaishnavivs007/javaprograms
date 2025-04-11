public class Demo {
    String color;
    String model;
    void displayInfo() {
        System.out.println("Car model: " + model);
        System.out.println("Car color: " + color);
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Toyota Corolla";
        myCar.color = "Red";
        myCar.displayInfo();
    }
}
