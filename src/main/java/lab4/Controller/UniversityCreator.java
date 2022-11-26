package lab4.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lab4.Model.Chief;
import lab4.Model.Faculty;
import lab4.Model.Sex;
import lab4.Model.University;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UniversityCreator {
    public University create(String UniversityName, int UniversityYear, String CityName, int NumberOfFaculties) throws FileNotFoundException, JsonProcessingException {

        FacultyCreator FacultyCreator = new FacultyCreator();
        ChiefCreator ChiefCreator = new ChiefCreator();
        Random random = new Random();

        University university = new University();

        university.setName(UniversityName);
        university.setCity(CityName);
        university.setYear(UniversityYear);

        Sex sex=null;
        if(random.nextInt(10)>5) sex=Sex.man; else sex=Sex.woman;
        Chief chief = ChiefCreator.create("chief of "+UniversityName,sex,20,university);
        university.setChief_name(chief.getName());

        List<Faculty> faculties= new ArrayList<>();

        for (int i=0;i<NumberOfFaculties;i++)
        {
          Faculty faculty=FacultyCreator.create("faculty"+(i+1),2,university);
          faculties.add(faculty);
        }
        university.setFaculties(faculties);

        return university;
    }

//    public University create(String json_string){
//
//        return university;
//    }

}
