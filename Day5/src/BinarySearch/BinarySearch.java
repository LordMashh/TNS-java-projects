
package BinarySearch;
import java.util.Scanner;
public class BinarySearch {
	  private static int[] arr = {30, 20, 10, 40, 100, 60, 80, 50, 90, 70};

	  public static int binarySearch(int key) {
	    int low = 0;
	    int high = arr.length - 1;

	    while (low <= high) {
	      int mid = (low + high) / 2;

	      if (arr[mid] == key) {
	        return mid;
	      } else if (arr[mid] < key) {
	        low = mid + 1;
	      } else {
	        high = mid - 1;
	      }
	    }

	    return -1;
	  }

	  public static void main(String[] args) {
	    // Get the number to search for from the user.
	    System.out.println("Enter the number to search for: ");
	    Scanner scanner = new Scanner(System.in);
	    int key = scanner.nextInt();

	    // Search for the number in the array.
	    int index = binarySearch(key);

	    // If the number is found, print its index. Otherwise, print a message that the number is not found.
	    if (index != -1) {
	      System.out.println("The number is found at index: " + index);
	    } else {
	      System.out.println("The number is not found.");
	    }
	  }
	}
