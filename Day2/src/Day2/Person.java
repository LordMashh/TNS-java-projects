package Day2;

public class Person {
	
	private int income;
	private float tax;
	private String pemail;
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public String getPemail() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	@Override
	public String toString() {
		return "Person [income=" + income + ", tax=" + tax + ", pemail=" + pemail + "]";
	}
	
	

}