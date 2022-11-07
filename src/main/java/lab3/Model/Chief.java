package lab3.Model;

public class Chief extends Human {
    protected String ControlObject;
    public Chief (){
        super();
    };
    public Chief (String name, int age){
        super(name,age);
    }
    public Chief (String name, int age, String ControlObject){
        super(name,age);
        this.ControlObject=ControlObject;
    }

    public String getControlObject() {
        return ControlObject;
    }

    public void setControlObject(String controlObject) {
        ControlObject = controlObject;
    }
}
