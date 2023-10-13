package Day2;


public class Intro_Main {
    public static void main(String[] args) {
        // Creating an instance of Intro_Class
        Intro_Class intro = new Intro_Class();
        
        // Setting values using setter methods
        intro.setName("Mayank");
        intro.setSrnol(101);
        
        // Accessing and printing the values using getter methods
        System.out.println("Name: " + intro.getName());
        System.out.println("SRNOL: " + intro.getSrnol());
        
        // Calling the printData method
        intro.printData();
        
        // Creating an instance of Person
        Person person = new Person();
        
        // Setting values using setter methods
        person.setIncome(50000);
        person.setTax(7500.50f);
        person.setPemail("Mayank@example.com");
        
        // Accessing and printing the values using getter methods
        System.out.println("Income: " + person.getIncome());
        System.out.println("Tax: " + person.getTax());
        System.out.println("Email: " + person.getPemail());
        
        // Using the toString method to print all values
        System.out.println(person);
    }
}