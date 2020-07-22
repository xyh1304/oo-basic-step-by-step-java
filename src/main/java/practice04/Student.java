package practice04;

public class Student extends Person{
    private int klass;
    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return "My name is "+ this.getName()+". I am "+ this.getAge()+" years old. I am a Student. I am at Class "+this.getKlass()+".";
    }
}
