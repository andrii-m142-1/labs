package lab4.Model;

public abstract class Human {
    protected String Name;
    protected int age;

    protected Sex sex;

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

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
