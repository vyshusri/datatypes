package Encapsulation;

public class student {
    private String name="Vaishnavi";
    private int rollNo=15;
    
    public String getname(){
        return name;
    }
    public String setname(String newname){
        this.name=newname;
        return newname;
    }
    public void getno(){
        System.out.println("Student rollno:"+rollNo);
    }
    public void setno(int newno){
        this.rollNo=newno;
        
    }
}
