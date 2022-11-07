package lab3.Model;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends StructureCore{
    protected List<Department> Departments;
    protected String University_Name;

    public Faculty (String structure_name, String director){
        super(structure_name, director);
    }
    public Faculty() {
    }

    public List<Department> getDepartments() {
        return Departments;
    }

    public void setDepartments(List<Department> departments) {
        Departments = departments;
    }

    public String getUniversity_Name() {
        return University_Name;
    }

    public void setUniversity_Name(String university_Name) {
        University_Name = university_Name;
    }
}
