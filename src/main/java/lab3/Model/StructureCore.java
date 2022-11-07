package lab3.Model;

public abstract class StructureCore implements Creatable{
    protected String name;
    protected String chief_name;

    public StructureCore(){}
    public StructureCore(String structure_name,String director){
    }

    public String getName(){
            return name;
            }

    public void setName(String name){
            this.name=name;
            }

    public String getChief_name(){
            return chief_name;
            }

    public void setChief_name(String chief_name){
            this.chief_name=chief_name;
            }
}
