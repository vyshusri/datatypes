
package DSA2;
import java.util.Queue;
import java.util.LinkedList;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> num=new LinkedList<>();
        num.offer(10);//offer() add to rear (it returns false)
        num.add(20);//add() also will add to rear but if queue is full is throwsan exception
        num.offer(30);
        num.offer(40);
        num.offer(50);
        num.offer(50);

        System.out.println(num);
        System.out.println("Remove:"+num.poll());//it removes first element
        System.out.println("First element:"+num.peek());//it views the the first element
        System.out.println(num.isEmpty());
        System.out.println(num.size());


    }
    
}

    

