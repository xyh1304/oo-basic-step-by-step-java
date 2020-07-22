package practice09;

public class Klass {
    private int number;
    private Student leader;
    private String displayName;

    public Klass(int number) {
        this.number = number;
        this.displayName = "Class 2";
    }

    public void assignLeader(Student student) {
        if(student.getKlass().number != this.number){
            System.out.print("It is not one of us.\n");
        }else {
            this.leader = student;
        }
    }

    public Student appendMember(Student student) {
        return student;
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
}
