package Encapsulation;

public class mainstu {
    public static void main(String[] args) {
        student obj=new student();
        System.out.println("student name:"+obj.getname());
        obj.setname("sriram");
        System.out.println("student newname:"+obj.getname());
        obj.getno();
        obj.setno(21);
        obj.getno();
        

        
    }
    
}
