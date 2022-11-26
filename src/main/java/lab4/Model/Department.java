package lab4.Model;

import java.util.List;

public class Department extends StructureCore{
    protected List<Group> groups;
    protected String University_Name;
    protected String Faculty_Name;

    public Department (String structure_name, String director){
        super(structure_name, director);
    }
    public Department() {
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
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
}
