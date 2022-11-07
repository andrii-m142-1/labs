package lab3;

// Створити програму що буде створювати та обробляти комплексний об'єкт під назвою університет(university).
//         Програма повинна складатися з трьох частин: модель вид та контролер згідно з парадигмою mvc (Model View Controller).
//         Кожній з цих груп повинна відповідати package з  відповідною назвою.  В моделі повинні знаходитись усі класи що відповідають
//         за структурні підрозділи університету. Серед них:   університет, факультет, кафедра, група, студент, людина (Human). Усі вони
//         повинні містити  назву  типу string та голову типу Human. Студент також повинен бути породжений від  Human.  Human повинен мати
//         поля ім'я, прізвище, побатькові та стать.  Усі поля повинні бути строковими окрім поля стать. Стать повинна використовувати спеціальний
//enum  типу Sex(стать).
//        В цій лабораторній роботі  група View Нам не потрібна.
//        Що стосується групи контроллер (controller)  то вона повинна містити менеджери що дозволяють нам створити відповідні підрозділи
//        наприклад  StudentCreator, FacultyCreator, GroupCreator  та інші, кожен з яких повинен використовувати можливості нижчого за рівнем   створювача.
//        Програма повинна також містити клас Run, в якому буде знаходитись точка входу та методи, що повинні дати можливість створити університет.
//        Процес         створення університету повинен бути зроблений в методі createTypycalUniversity.
//        В програмі активно рекомендується використовувати абстрактні класи та інтерфейси

import lab3.Controller.UniversityCreator;
import lab3.Model.Faculty;
import lab3.Model.University;

public class Run {
    public static void main(String[] args) {
        University university1;
        university1=createTypicalUniversity();
        System.out.println("Name of university: " + university1.getName());
        System.out.println("University city: " + university1.getCity());
        System.out.println("University year of foundation: " + university1.getYear());
        System.out.println("University director's name: " + university1.getChief_name());
        System.out.println("University faculties: ");
        for (Faculty i : university1.getFaculties()){
            System.out.println(i.getName());
        }


    }
    public static University createTypicalUniversity(){
        UniversityCreator universityCreator=new UniversityCreator();

        University university = universityCreator.create("Dnipro University",2000,"Dnipro",3);
        return university;
    }
}
