package Day2;

 class Personinfo {

	   public static void main (String arr[])
	{
	
	Person p1 = new Person() ;
	p1.setIncome(5000);
	p1.setPemail("SJ");
	p1.setPname("sham");
	p1.setTax(2.0f);
	
	String s  = p1.toString();
	System.out.println(s);
	
	
}
}
