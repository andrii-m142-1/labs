package lab3.Controller;

import lab3.Model.Chief;
import lab3.Model.Sex;
import lab3.Model.StructureCore;

public class ChiefCreator {
    public Chief create(String name, Sex sex, int age, StructureCore ControlObject)
    {
        Chief chief= new Chief();
        chief.setName(name);
        chief.setAge(age);
        chief.setControlObject(ControlObject.getName());
        chief.setSex(sex);
        return chief;
    }
}
