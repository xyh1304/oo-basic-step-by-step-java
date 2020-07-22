package practice11;

import java.util.LinkedList;

public class Teacher extends Person implements JoinListener{
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        this.classes.forEach(klass -> {
            klass.registerListener(this);
        });
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {

        if (this.classes != null && this.classes.size() != 0 ) {
            StringBuilder klasses = new StringBuilder();
            int i = 0;
            for (Klass klass: this.classes) {
                i++;
                klasses.append(klass.getNumber());
                if(i!=this.classes.size()){
                    klasses.append(", ");
                }
            }
            return super.introduce() + " I am a Teacher. I teach Class "+ klasses+ ".";
        } else {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student student) {
        for (Klass klass: classes) {
            if(student.getKlass().getNumber() == klass.getNumber()) {
                return super.introduce() + " I am a Teacher. I teach "+ student.getName()+".";
            }
        }
        return super.introduce() + " I am a Teacher. I don't teach "+ student.getName()+".";
    }

    public boolean isTeaching(Student student) {
        for (Klass klass: classes) {
            boolean isInKlass = klass.isIn(student);
            if(isInKlass){
                return isInKlass;
            }
        }
        return false;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }


    @Override
    public void updateMember(Student student) {
        System.out.print("I am " + this.getName() + ". I know " + student.getName() + " has joined Class " + student.getKlass().getNumber() + ".\n");

    }

    @Override
    public void updateLeader(Student student) {
        System.out.print("I am "+this.getName()+". I know "+student.getName()+" become Leader of Class "+student.getKlass().getNumber()+".\n");
    }

}
