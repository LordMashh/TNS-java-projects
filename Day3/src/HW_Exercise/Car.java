package HW_Exercise;

public class Car {
    // Private attributes
    private String model;
    private double price;
    private boolean isEngineStarted;

    // Constructor
    public Car(String model, double price) {
        this.model = model;
        this.price = price;
        this.isEngineStarted = false;
    }

    // Public methods for controlling the car
    public void start() {
        if (!isEngineStarted) {
            isEngineStarted = true;
            System.out.println(model + " engine started.");
        } else {
            System.out.println(model + " engine is already running.");
        }
    }

    public void stop() {
        if (isEngineStarted) {
            isEngineStarted = false;
            System.out.println(model + " engine stopped.");
        } else {
            System.out.println(model + " engine is already off.");
        }
    }

    public void move() {
        if (isEngineStarted) {
            System.out.println(model + " is moving.");
        } else {
            System.out.println(model + " can't move because the engine is off.");
        }
    }

    // Getter methods for model and price
    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}

