package lab4.Controller;

import lab4.Model.Group;
import lab4.Model.Sex;
import lab4.Model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentCreator {
    public Student create(String name, Sex sex, int age, Group group )
    {
        Student student= new Student();
        student.setName(name);
        student.setAge(age);
        student.setGroup_Name(group.getName());
        student.setDepartament_Name(group.getDepartament_Name());
        student.setFaculty_Name(group.getFaculty_Name());
        student.setUniversity_Name(group.getUniversity_Name());
        student.setSex(sex);
        return student;
    }
}
