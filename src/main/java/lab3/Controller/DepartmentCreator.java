package lab3.Controller;

import lab3.Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DepartmentCreator {
    public Department create(String name, int countOfGroups, Faculty faculty) {
        GroupCreator GroupCreator = new GroupCreator();
        ChiefCreator ChiefCreator = new ChiefCreator();
        Department department = new Department();
        Random random = new Random();
        List<Group> groups = new ArrayList<>();
        department.setName(name);
        department.setUniversity_Name(faculty.getUniversity_Name());
        department.setFaculty_Name(faculty.getName());
        Chief chief = ChiefCreator.create("chief of " +name,20,department);
        department.setChief_name(chief.getName());
        for (int i = 0; i < countOfGroups; i++) {
            Group group = GroupCreator.create("group"+(i+1), random.nextInt(10),department);
            groups.add(group);
        }
        department.setGroups(groups);

        return department;
    }
}
