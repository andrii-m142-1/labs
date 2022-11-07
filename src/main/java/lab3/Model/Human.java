package lab3.Model;

public abstract class Human {
    protected String Name;
    protected int age;

    Human(String name, int age){
        this.Name=name;
        this.age=age;
    }
    Human(){    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
