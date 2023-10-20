public class Student extends Person {

    private String score;

    public Student() {
        super();
    }

    public Student(String name, String score) {
        super(name);
        this.score = score;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [name=" + getName() + ", score=" + score + "]";
    }
}