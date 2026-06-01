
 package DSA2;
import java.util.Deque;
import java.util.ArrayDeque;

public class Deque1 {
    public static void main(String[] args) {
        Deque<Integer>num=new ArrayDeque<>();

num.addFirst(12);
num.add(13);
num.addLast(14);

System.out.println(num);
System.out.println(num.peek());     
System.out.println(num.peekFirst()); 
System.out.println(num.peekLast());  

System.out.println(num.pollFirst());
System.out.println(num.peekLast());
System.out.println(num.removeFirst());
System.out.println(num);
System.out.println(num.size());
    }
    
}
 
    

