public class Demo {

    public static void main(String[] args) {
        Employee e1 = new Employee("Mayank", "Developer");
        System.out.println(e1.toString());

        Student s1 = new Student("Rohan", "Dist");
        System.out.println(s1.toString());

        // Use of instanceof to check the type of objects
        if (e1 instanceof Employee) {
            System.out.println("e1 is an Employee");
        }

        if (s1 instanceof Student) {
            System.out.println("s1 is a Student");
        }
    }
}