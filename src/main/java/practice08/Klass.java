package practice08;

public class Klass {
    private int number;
    private Student leader;
    private String displayName;

    public Klass(int number) {
        this.number = number;
        this.displayName = "Class 2";
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student) {
        this.leader = student;
    }
}
