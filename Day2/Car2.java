package Day2;

public class Car2 {
	
    private int year;
    private String make;
    private double speed;

  
    public Car2(int year, String make, double speed) {
        this.year = year;
        this.make = make;
        this.speed = speed;
    }


    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public double getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        // Example usage
        Car2 c2 = new Car2(2015, "Honda", 85.0);

        // Accessing and printing car details using getter methods
        System.out.println("Year: " + c2.getYear());
        System.out.println("Make: " + c2.getMake());
        System.out.println("Speed: " +c2.getSpeed());
    }
}
