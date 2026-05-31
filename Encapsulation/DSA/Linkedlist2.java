package Encapsulation.DSA;
import java.util.LinkedList;
import java.util.Collections;

public class Linkedlist2 {
    public static void main(String[] args) {
        LinkedList<Double> num=new LinkedList<>();
        num.add(0,21.2);
        num.add(1,32.2);
        num.add(2,34.3);
        num.addFirst(34.5);

        num.set(2,31.3 );

        System.out.println(num);
        System.out.println(num.get(0));
        System.out.println(num.get(1));
        System.out.println(num.get(2));
        System.out.println("first:"+num.getFirst());

        System.out.println(num.size());
        System.out.println(num.contains(32.8));

        Collections.sort(num);
        System.out.println(num);


    }
    
}
