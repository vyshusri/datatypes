package DSA2;
import java.util.HashSet;
import java.util.List;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> set1=new HashSet<>(List.of("sri","sai","vai","jai"));
        HashSet<String> set2=new HashSet<>();
        set2.add("jai");
        set2.add("ram");
        set2.add("sai");
        set2.add("sri");
        set1.remove("sai");//remove the elements
        set1.add("sai");//duplication
        

        System.out.println("set1 elements:"+set1 +" \n" +"set2 elements:"+set2);
        System.out.println("Remove Set1 elements:"+set1);
        System.out.println("sri element is contains in the the set1:"+set1.contains("sri"));
        System.out.println("size of the set1,set2:"+set1.size()+","+set2.size());

        set2.addAll(set1);
        System.out.println("all elments:"+set2);

        set1.retainAll(set2);
        System.out.println("common elents:"+set1);

        set1.removeAll(set2);
            System.out.println(set1);
            System.out.println(set2);
        
    }
}

    

