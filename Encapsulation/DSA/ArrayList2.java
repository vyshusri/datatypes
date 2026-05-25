package Encapsulation.DSA;

import java.util.ArrayList; 
import java.util.Collections;

    public class ArrayList2 {
    public static void main(String[] args) {
        
    
    ArrayList<String> students = new ArrayList<>(); 
students.add(0,"sriram");
students.add(1,"vaishnavi");
students.add(2,"sahasthra");  
students.add(3,"sathwika");
students.add(0,"sairam");
students.set(0,"meghana");


System.out.println("student name:"+students);
System.out.println(students.get(0));
System.out.println(students.get(1));
System.out.println(students.get(2));
System.out.println(students.get(3));
System.out.println(students.get(0));
System.out.println(students);
System.out.println(students.contains("sriram"));
System.out.println(students.isEmpty());




Collections.sort(students);//sort
System.out.println(students);
students.clear();
System.out.println(students);

    
    }
}
    

