package Encapsulation.DSA;
import java.util.ArrayList; 
import java.util.Collections;

    public class ArrayList1 {
    public static void main(String[] args) {
        
    
    ArrayList<String> fruits = new ArrayList<>(); 
    
    fruits.add("Apple");
    fruits.add("Pineapple");
    fruits.add("Orange");
    fruits.add(0,"Banana");
    fruits.set(1,"watermelon");
    fruits.remove(0);
    
    System.out.println("Fruits:"+fruits);
    System.out.println("Friuts:"+fruits.get(1));
    System.out.println("Friuts:"+fruits.isEmpty());
    System.out.println(fruits.size());


    
    }
}
    

