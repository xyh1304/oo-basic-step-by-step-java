package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass{
    private int number;
    private Student leader;
    private String displayName;
    List<JoinListener> joinListeners = new ArrayList<>();


    public Klass(int number) {
        this.number = number;
        this.displayName = "Class " + this.number;
    }

    public void assignLeader(Student student) {
        if(student.getKlass().number != this.number){
            System.out.print("It is not one of us.\n");
        }else {
            this.leader = student;
            this.joinListeners.forEach( listener -> {
                listener.updateLeader(student);
            });
        }
    }

    public void appendMember(Student student) {
        student.getKlass().setNumber(this.number);
        this.joinListeners.forEach( listener -> {
            listener.updateMember(student);
        });
    }

    public void registerListener(JoinListener joinListener) {
        this.joinListeners.add(joinListener);
    }

    public boolean isIn(Student student) {
        if(this.number == student.getKlass().getNumber()){
            return true;
        }
        return false;
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

    public void setNumber(int number) {
        this.number = number;
    }
}
