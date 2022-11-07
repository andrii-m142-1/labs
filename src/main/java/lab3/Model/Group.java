package lab3.Model;

import java.util.List;

public class Group extends StructureCore{

    protected List<Student> students;
    protected String University_Name;
    protected String Faculty_Name;
    protected String Departament_Name;
    public Group (String structure_name, String director){
        super(structure_name, director);
    }
    public Group() {
    }

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
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
}
