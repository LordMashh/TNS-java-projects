package Hw_exercise2;

public class Dog {
    
    private String breed;
    private int age;
    private String color;

    
    public Dog(String breed, int age, String color) {
        this.breed = breed;
        this.setAge(age);
        this.setColor(color);
    }

    // 1st Class method to make the dog bark
    public void bark() {
        System.out.println(breed + " dog is barking!");
    }

    // 2nd Class method to make the dog sleep
    public void sleep() {
        System.out.println(breed + " dog is sleeping.");
    }

    public static void main(String[] args) {
       
        Dog dog1 = new Dog("Rotweiler", 3, "White");
        Dog dog2 = new Dog("BullDog", 2, "Black");

    
        dog1.bark();
        dog1.sleep();

        dog2.bark();
        dog2.sleep();
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}