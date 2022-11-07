package lab3.Controller;

import lab3.Model.Chief;
import lab3.Model.Faculty;
import lab3.Model.University;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UniversityCreator {
    public University create(String UniversityName, int UniversityYear, String CityName, int NumberOfFaculties){

        FacultyCreator FacultyCreator = new FacultyCreator();
        ChiefCreator ChiefCreator = new ChiefCreator();
        Random random = new Random();
        University university = new University();
        university.setName(UniversityName);
        university.setCity(CityName);
        university.setYear(UniversityYear);
        Chief chief = ChiefCreator.create("chief of "+UniversityName,20,university);
        university.setChief_name(chief.getName());
        List<Faculty> faculties= new ArrayList<>();

        for (int i=0;i<NumberOfFaculties;i++)
        {
          Faculty faculty=FacultyCreator.create("faculty"+(i+1),5,university);
          faculties.add(faculty);
        }
        university.setFaculties(faculties);
        return university;
    }
}
