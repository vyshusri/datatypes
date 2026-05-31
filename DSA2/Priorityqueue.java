package DSA2;
import java.util.List;
import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> num=new PriorityQueue<>(List.of(12,13,22,13,16,10,78,68));
        System.out.println(num);
        System.out.println("first element:"+num.peek());
       // System.out.println(num.peek());
       // System.out.println(num.peek());
       System.out.println("remove:"+num.poll());
       
        System.out.println(num.peek());
       System.out.println("empty:"+num.isEmpty());
        System.out.println("size:"+num.size());
        
        //System.out.println(num.poll());
        //System.out.println(num.peek());
        System.out.println(num);
        //System.out.println(num.poll());
        //System.out.println(num);
        //System.out.println(num.poll());
        //System.out.println(num);
        //System.out.println(num.poll());
        //System.out.println(num);
        

    }
}
