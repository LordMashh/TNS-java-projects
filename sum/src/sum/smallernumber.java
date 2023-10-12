package sum;

public class smallernumber {
	double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    double num3 = input.nextDouble();

    double smallest;

    if (num1 <= num2 && num1 <= num3) {
        smallest = num1;
    } else if (num2 <= num1 && num2 <= num3) {
        smallest = num2;
    } else {
        smallest = num3;
    }

    System.out.println("The smallest number is: " + smallest);
}
