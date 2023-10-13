package HW_Exercise;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry", 25000.0);
        Car car2 = new Car("Honda Civic", 22000.0);
        
        Driver driver1 = new Driver("John", 30);
        Driver driver2 = new Driver("mayank", 25);
        
        System.out.println("Driver 1: " + driver1.getName() + ", Age: " + driver1.getAge());
        System.out.println("Driver 2: " + driver2.getName() + ", Age: " + driver2.getAge());
        
        System.out.println("\nCar 1: Model - " + car1.getModel() + ", Price - $" + car1.getPrice());
        System.out.println("Car 2: Model - " + car2.getModel() + ", Price - $" + car2.getPrice());
        
        driver1.drive(car1);
        System.out.println();
        driver2.drive(car2);
    }
}