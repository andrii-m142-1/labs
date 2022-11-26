package lab4.Controller;

import lab4.Model.Chief;
import lab4.Model.Sex;
import lab4.Model.StructureCore;

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
