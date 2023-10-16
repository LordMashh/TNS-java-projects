package Sequential_HW;
import java.util.Scanner;
public class SequentialSearch {
	    public static int[] array = {10, 200, 25, 44, 36, 6, 77 , 82, 59, 100};

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the number to search for: ");
	        int searchNumber = input.nextInt();

	        int index = sequentialSearch(array, searchNumber);

	        if (index != -1) {
	            System.out.println("The number " + searchNumber + " is found at index " + index);
	        } else {
	            System.out.println("The number " + searchNumber + " is not found in the array.");
	        }
	    }

	    public static int sequentialSearch(int[] array, int searchNumber) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == searchNumber) {
	                return i;
	            }
	        }
	        return -1;
	    }
	}