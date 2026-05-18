package Encapsulation;

public class marksMain {
    public static void main(String[] args) {
        System.out.println("Student Deatails:");
    marks obj=new marks();

    obj.getSubjects();

    System.out.println("Sum of total Subjects:"+obj.getTotal());

    System.out.println("Average marks:"+obj.getAvg());

    obj.getGrade();
    }
    
}
