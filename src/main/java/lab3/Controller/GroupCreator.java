package lab3.Controller;


import lab3.Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GroupCreator {
    public Group create(String name , int countOfStudents, Department department)
    {
        StudentCreator StudentCreator = new StudentCreator();
        ChiefCreator ChiefCreator = new ChiefCreator();
        Group Group = new Group();
        Random random = new Random();
        Group.setName(name);
        Group.setUniversity_Name(department.getUniversity_Name());
        Group.setFaculty_Name(department.getFaculty_Name());
        Group.setDepartament_Name(department.getName());
        Chief chief = ChiefCreator.create("chief of " + name,20,Group);
        Group.setChief_name(chief.getName());

        List<Student> students = new ArrayList<>();
        for (int i=0;i<countOfStudents;i++)
        {
            Student student =StudentCreator.create("Student"+(i+1),20,Group);
            students.add(student);
        }
        Group.setStudents(students);

        return Group;
}
}
