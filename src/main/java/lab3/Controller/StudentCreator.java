package lab3.Controller;

import lab3.Model.Group;
import lab3.Model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentCreator {
    public Student create(String name, int age,Group group )
    {
        Student student= new Student();
        student.setName(name);
        student.setAge(age);
        student.setGroup_Name(group.getName());
        student.setDepartament_Name(group.getDepartament_Name());
        student.setFaculty_Name(group.getFaculty_Name());
        student.setUniversity_Name(group.getUniversity_Name());
        return student;
    }
}
