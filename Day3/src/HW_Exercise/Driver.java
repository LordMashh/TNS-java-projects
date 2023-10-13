package HW_Exercise;

public class Driver {
    // Private attributes
    private String name;
    private int age;

    // Constructor
    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public method for driving the car
    public void drive(Car car) {
        System.out.println(name + " is driving the " + car.getModel() + " car.");
        car.start();
        car.move();
        car.stop();
    }

    // Getter methods for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
