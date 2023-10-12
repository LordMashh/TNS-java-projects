package Day2;

public class Dog {
	String breed = "German Shepherd"; 
	int age = 13;
	String color = "Black" ;
	
	public void bark() {
		System.out.println("The dog is barking.");

	}
	
	 public void sleep() {
	        System.out.println("The dog is sleeping.");
	        
	    }
	 

	 public static void main(String arr[]) {
		 Dog d1 = new Dog();
		 System.out.println("breed of Dog is "+d1.breed);
		 System.out.println("age of Dog is "+d1.age);
		 System.out.println("color of Dog is "+d1.color);
		 d1.bark();
		 d1.sleep();

		 
		 
	 }
}
