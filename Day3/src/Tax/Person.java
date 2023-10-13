package Tax;

public class Person {
    private int age;
    private String gender;
    private int income;
    private float tax;

    // Constructor
    public Person(int age, String gender, int income) {
        this.age = age;
        this.gender = gender;
        this.income = income;
    }

    // Getters and setters
    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getIncome() {
        return income;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", gender=" + gender + ", income=" + income + ", tax=" + tax + "]";
    }
}