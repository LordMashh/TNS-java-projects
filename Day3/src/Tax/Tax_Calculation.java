package Tax;

public class Tax_Calculation {
    // Function to calculate tax
    public void calculateTax(Person person) {
        int income = person.getIncome();
        float tax = 0;

        if (person.getAge() > 65 || person.getGender().equalsIgnoreCase("female")) {
            person.setTax(0);
            System.out.println("Tax not applicable");
        } else {
            if (income <= 160000) {
                // No tax
                tax = 0;
            } else if (income > 160000 && income <= 500000) {
                // 10% on income above 160000
                tax = (income - 160000) * 10 / 100;
            } else if (income > 500000 && income <= 800000) {
                // 20% on income above 500000 + 34000 (fixed amount)
                tax = (income - 500000) * 20 / 100 + 34000;
            } else {
                // 30% on income above 800000 + 94000 (fixed amount)
                tax = (income - 800000) * 30 / 100 + 94000;
            }

            person.setTax(tax);
        }
    }
}