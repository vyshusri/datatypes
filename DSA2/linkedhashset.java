package DSA2;
import java.util.LinkedHashSet;
import java.util.List;

public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> num1=new LinkedHashSet<>(List.of(1,2,6,8));
        LinkedHashSet<Integer>num2=new LinkedHashSet<>(List.of(5,7,1,2));
        
        num1.remove(1);
        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);
         num1.retainAll(num2);
        System.out.println("commom elements:"+num1);
        num1.addAll(num2);
        System.out.println("adding all elemets:"+num1);
         num1.retainAll(num2);
        System.out.println(num1);
        num2.removeAll(num1);
        System.out.println("removing common elements from num2:"+num2);
        num1.removeAll(num2);
        System.out.println("removing  common elemts from num1:"+num1);
       
    }
    
}
