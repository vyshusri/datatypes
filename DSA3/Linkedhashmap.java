package DSA3;
import java.util.LinkedHashMap;

public class Linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> num=new LinkedHashMap<>();

        num.put(1, 2);
        num.put(2, 3);
        num.put(3,4);
        num.put(4,5);
        num.put(5,6);

        System.out.println(num);
        System.out.println("keys:"+num.keySet());
        System.out.println("values:"+num.values());
        System.out.println("remove:"+num.remove(2));
        System.out.println("size:"+num.size());
        System.out.println("contains key:"+num.containsKey(1)+"\n"+"contains value:"+num.containsValue(4));
        System.out.println(num.getOrDefault(2,0));
        
        num.replace(4, 5, 10);
        System.out.println(num);//replace 5=10

        System.out.println(num.merge(1, 3, Integer::sum)); // 3+2 = 5 
        System.out.println(num);

 

    }
}
