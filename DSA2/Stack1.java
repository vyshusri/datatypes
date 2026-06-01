package DSA2;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> student=new Stack<>();
        
        student.push("Sriram");
        student.push("Sairam");
        student.push("Jairam");
        student.push("Ram");

        System.out.println("Students:"+student);
        System.out.println("Remove:"+student.pop());//remove first top element
        System.out.println(student);
        System.out.println("Top element:"+student.peek());//views the top element(not remove)
        System.out.println(student);
        System.out.println(student.search("Jairam"));//serach the elment in the element
        System.out.println(student.isEmpty());
        System.out.println(student.size());
        System.out.println(student);



    }
}
