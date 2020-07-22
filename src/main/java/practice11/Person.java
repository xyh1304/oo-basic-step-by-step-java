package practice11;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public String introduce() {
        return "My name is "+ this.name +". I am "+ this.age +" years old.";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person) {
            Person person = (Person) obj;
            if(person.getId() == this.getId()){
                return  true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}
