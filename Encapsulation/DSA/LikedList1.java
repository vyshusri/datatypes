package Encapsulation.DSA;
import java.util.LinkedList;

import Encapsulation.student;

import java.util.Collections;

public class LikedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> number=new LinkedList<>();
        
         
        number.add(0,11);
        number.add(1,12);
        number.add(2,13);
        number.add(3,14);
        number.add(2,10);

        number.set(1,22);//it replace the value 

        System.out.println("Numbers:"+number);
        System.out.println(number.get(0));
        System.out.println(number.get(1));
        System.out.println(number.get(2));
        System.out.println(number.get(3));

        System.out.println(number.size());

        System.out.println(number.isEmpty());

        System.out.println(number.contains(10));//checks whether the value is there

        Collections.sort(number);//Alphabetically
        System.out.println(number);

        number.clear();
        System.out.println(number);



    



    }
}
