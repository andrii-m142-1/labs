package lab3.Model;

import java.util.List;

public class University extends StructureCore {
    protected int year;
    protected String city;
    protected List<Faculty> Faculties;


    public List<Faculty> getFaculties() {
        return Faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        Faculties = faculties;
    }

    public University(String name, String director_name ,int year, String city){
        super(name,director_name);
        this.year=year;
        this.city=city;
    }

    public University (String structure_name, String director){
        super(structure_name, director);
    }
    public University() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
