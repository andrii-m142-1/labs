package lab3.Model;

public class Student extends Human{

    protected String University_Name;
    protected String Faculty_Name;
    protected String Departament_Name;
    protected String Group_Name;
    public Student(String name, int age) {
        super(name, age);
    }
    public Student() {
        super();
    }

    public String getUniversity_Name() {
        return University_Name;
    }

    public void setUniversity_Name(String university_Name) {
        University_Name = university_Name;
    }

    public String getFaculty_Name() {
        return Faculty_Name;
    }

    public void setFaculty_Name(String faculty_Name) {
        Faculty_Name = faculty_Name;
    }

    public String getDepartament_Name() {
        return Departament_Name;
    }

    public void setDepartament_Name(String departament_Name) {
        Departament_Name = departament_Name;
    }

    public String getGroup_Name() {
        return Group_Name;
    }

    public void setGroup_Name(String group_Name) {
        Group_Name = group_Name;
    }
}

