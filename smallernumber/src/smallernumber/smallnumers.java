package smallernumber;

public class smallnumers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 10;
        double num2 = 20;
        double num3 = 30;

        double smallest = Math.min(Math.min(num1, num2), num3);

        System.out.println("The smallest number is: " + smallest);
    }

}
