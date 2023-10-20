public class Employee extends Person {

    private String department;

    public Employee() {
        super();
    }

    public Employee(String name, String department) {
        super(name);
        this.setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [name=" + getName() + ", department=" + department + "]";
    }
}