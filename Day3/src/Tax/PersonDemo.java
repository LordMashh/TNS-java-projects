package Tax;

public class PersonDemo {
    public static void main(String[] args) {
        // Create a Person object with age, gender, and income
        Person person1 = new Person(70, "female", 900000);
        Person person2 = new Person(40, "male", 300000);
        Person person3 = new Person(50, "female", 600000);
        Person person4 = new Person(30, "male", 900000);

        // Create a Tax_Calculation object
        Tax_Calculation taxCalculation = new Tax_Calculation();

        // Calculate tax for each person
        taxCalculation.calculateTax(person1);
        taxCalculation.calculateTax(person2);
        taxCalculation.calculateTax(person3);
        taxCalculation.calculateTax(person4);

        // Print the tax information for each person
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
    }
}