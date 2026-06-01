package DSA2;
import java.util.TreeSet;
import java.util.List;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<Character> letter1=new TreeSet<>(List.of('D','F','F','V','S'));
        TreeSet<Character> letter2=new TreeSet<>(List.of('S','D','I','N'));
        System.out.println(letter1+"\n"+letter2);

        letter1.remove('D');
        System.out.println(letter1);
        letter1.addAll(letter2);
        System.out.println(letter1);
        
        System.out.println(letter1.size()+"\n"+letter2.size());
        letter1.retainAll(letter2);
        System.out.println(letter1);
    }


    }
    

