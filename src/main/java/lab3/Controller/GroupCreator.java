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
        Sex sex=null;
        if(random.nextInt(10)>5) sex=Sex.man; else sex=Sex.woman;//sex for Chief
        Chief chief = ChiefCreator.create("chief of " + name,sex,20,Group);
        Group.setChief_name(chief.getName());

        if(random.nextInt(10)>5) sex=Sex.man; else sex=Sex.woman;//sex for Student
        List<Student> students = new ArrayList<>();
        for (int i=0;i<countOfStudents;i++)
        {
            Student student =StudentCreator.create("Student"+(i+1),sex,20,Group);
            students.add(student);
        }
        Group.setStudents(students);

        return Group;
}
}
