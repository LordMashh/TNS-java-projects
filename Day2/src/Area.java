class Areaa{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double Area() {
        return length * breadth;
    }
}


public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangle r1 = new Rectangle(4, 5);
	     Rectangle r2 = new Rectangle(5, 8);
	     System.out.println("Area of first rectangle: " + r1.Area());
	     System.out.println("Area of second rectangle: " + r2.Area());

	}

}
