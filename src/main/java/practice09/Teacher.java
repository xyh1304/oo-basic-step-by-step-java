package practice09;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        if (this.klass != null) {
            return super.introduce() + " I am a Teacher. I teach Class "+ this.klass.getNumber() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student student) {
        if(student.getKlass().getNumber() == this.klass.getNumber()) {
            return super.introduce() + " I am a Teacher. I teach "+ student.getName()+".";
        }else {
            return super.introduce() + " I am a Teacher. I don't teach "+ student.getName()+".";
        }
    }

    public Klass getKlass() {
        return klass;
    }
}
