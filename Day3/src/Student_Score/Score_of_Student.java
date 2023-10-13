package Student_Score;

public class Score_of_Student {
	
	int finalscore;
	Student s1 = new Student();
	
	public void getScore() {
		s1.setUid(1021);
		s1.setSname("Mayank");
		finalscore=87;
		
		System.out.println(s1.toString() + " and score is " + finalscore);
	}

}