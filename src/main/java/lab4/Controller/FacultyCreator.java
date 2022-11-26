package lab4.Controller;

import lab4.Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FacultyCreator {
    public Faculty create(String name, int numberOfDepartments, University university) {
        DepartmentCreator DepartmentCreator = new DepartmentCreator();
        ChiefCreator ChiefCreator = new ChiefCreator();
        Random random = new Random();
        Faculty faculty = new Faculty();
        faculty.setName(name);
        faculty.setUniversity_Name(university.getName());
        Sex sex=null;
        if(random.nextInt(10)>5) sex=Sex.man; else sex=Sex.woman;
        Chief chief = ChiefCreator.create("chief of "+name,sex,20,faculty);
        faculty.setChief_name(chief.getName());
        List<Department> departaments = new ArrayList<>();
        for (int i=0;i<numberOfDepartments;i++)
        {
            Department departament = DepartmentCreator.create("departament"+(i+1),2,faculty);
            departaments.add(departament);
        }
        faculty.setDepartments(departaments);


        return faculty;
    }
}
