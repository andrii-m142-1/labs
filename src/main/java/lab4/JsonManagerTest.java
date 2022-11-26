package lab4;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lab4.Controller.JsonManager;
import lab4.Controller.UniversityCreator;
import lab4.Model.*;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.List;

public class JsonManagerTest {
    @Test
    public void main() throws FileNotFoundException, JsonProcessingException {
        UniversityCreator universityCreator=new UniversityCreator();
        University oldUniversity = universityCreator.create("Dnipro University",1899,"Dnipro",2);
        JsonManager JsonManager = new JsonManager();
        String name_file=JsonManager.writeFile(oldUniversity);
        University newUniversity = JsonManager.readFile(name_file);
        System.out.println("Result of comparsion:"+ equals(oldUniversity,newUniversity));

    }
    private static boolean equals(University oldUniversity, University newUniversity) {
        boolean equals=true;
        if(!oldUniversity.getName().equals(newUniversity.getName())){
            equals=false;
            return equals;
        }
        if(!oldUniversity.getCity().equals(newUniversity.getCity())){
            equals=false;
            return equals;
        }
        if(oldUniversity.getYear()!=newUniversity.getYear()){
            equals=false;
            return equals;
        }
        if(!oldUniversity.getChief_name().equals(newUniversity.getChief_name())){
            equals=false;
            return equals;
        }
        List<Faculty> oldFaculties=oldUniversity.getFaculties();
        List <Faculty> newFaculties=newUniversity.getFaculties();
        if(oldFaculties.size()!=newFaculties.size()) {
            equals=false;
            return equals;
        }else {
            for (int i = 0; i < oldFaculties.size(); i++) {
                if(!oldFaculties.get(i).getName().equals(newFaculties.get(i).getName())){
                    equals = false;
                    return equals;
                }
                if(!oldFaculties.get(i).getUniversity_Name().equals(newFaculties.get(i).getUniversity_Name())){
                    equals = false;
                    return equals;
                }
                if(!oldFaculties.get(i).getChief_name().equals(newFaculties.get(i).getChief_name())){
                    equals = false;
                    return equals;
                }
                List<Department> oldDepartaments = oldFaculties.get(i).getDepartments();
                List<Department> newDepartaments = newFaculties.get(i).getDepartments();
                if (oldDepartaments.size() != newDepartaments.size()) {
                    equals = false;
                    return equals;
                } else {
                    for (int j = 0; j < oldDepartaments.size(); j++) {
                        if(!oldDepartaments.get(j).getName().equals(newDepartaments.get(j).getName())){
                            equals = false;
                            return equals;
                        }
                        if(!oldDepartaments.get(j).getUniversity_Name().equals(newDepartaments.get(j).getUniversity_Name())){
                            equals = false;
                            return equals;
                        }
                        if(!oldDepartaments.get(j).getChief_name().equals(newDepartaments.get(j).getChief_name())){
                            equals = false;
                            return equals;
                        }
                        if(!oldDepartaments.get(j).getFaculty_Name().equals(newDepartaments.get(j).getFaculty_Name())){
                            equals = false;
                            return equals;
                        }
                        List<Group> oldGroups = oldDepartaments.get(j).getGroups();
                        List<Group> newGroups = newDepartaments.get(j).getGroups();
                        if (oldGroups.size() != newGroups.size()) {
                            equals = false;
                            return equals;
                        } else {
                            for (int k = 0; k < oldGroups.size(); k++) {
                                if(!oldGroups.get(k).getName().equals(newGroups.get(k).getName())){
                                    equals = false;
                                    return equals;
                                }
                                if(!oldGroups.get(k).getUniversity_Name().equals(newGroups.get(k).getUniversity_Name())){
                                    equals = false;
                                    return equals;
                                }
                                if(!oldGroups.get(k).getChief_name().equals(newGroups.get(k).getChief_name())){
                                    equals = false;
                                    return equals;
                                }
                                if(!oldGroups.get(k).getFaculty_Name().equals(newGroups.get(k).getFaculty_Name())){
                                    equals = false;
                                    return equals;
                                }
                                if(!oldGroups.get(k).getDepartament_Name().equals(newGroups.get(k).getDepartament_Name())){
                                    equals = false;
                                    return equals;
                                }
                                List<Student> oldStudents = oldGroups.get(k).getStudents();
                                List<Student> newStudents = newGroups.get(k).getStudents();
                                if (oldStudents.size() != newStudents.size()) {
                                    equals = false;
                                    return equals;
                                } else {
                                    for (int r = 0; r < oldStudents.size(); r++) {
                                        if(!newStudents.get(r).getName().equals(newStudents.get(r).getName())){
                                            equals = false;
                                            return equals;
                                        }
                                        if(!newStudents.get(r).getUniversity_Name().equals(newStudents.get(r).getUniversity_Name())){
                                            equals = false;
                                            return equals;
                                        }
                                        if (oldStudents.get(r).getAge() != newStudents.get(r).getAge()) {
                                            equals = false;
                                            return equals;
                                        }
                                        if(!newStudents.get(r).getFaculty_Name().equals(newStudents.get(r).getFaculty_Name())){
                                            equals = false;
                                            return equals;
                                        }
                                        if(!newStudents.get(r).getDepartament_Name().equals(newStudents.get(r).getDepartament_Name())){
                                            equals = false;
                                            return equals;
                                        }
                                        if(!newStudents.get(r).getSex().equals(newStudents.get(r).getSex())){
                                            equals = false;
                                            return equals;
                                        }
                                        if(!newStudents.get(r).getGroup_Name().equals(newStudents.get(r).getGroup_Name())){
                                            equals = false;
                                            return equals;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return equals;
    }
}
