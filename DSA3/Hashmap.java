package DSA3;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,String> name=new HashMap<>();

        name.put("Sriram","Vyshu");
        name.put("Thummala","Sahastra");
        name.put("Rathkanti", "Sathwika");
        name.put("Puram", "Meghana");
        name.put("Sriram","Vaishnavi");//duplication(keyis unique ,value can be double)

        System.out.println(name);
        System.out.println(name.get("Sriram")+"\n"+name.get("Thummala")+"\n"+name.get("Puram")+name.get("Rathkanti"));
        System.out.println("keys:"+name.keySet());
        System.out.println("values:"+name.values());
        System.out.println("Contains the keys:"+name.containsKey("Sriram"));
        System.out.println("contains the valuee:"+name.containsValue("Sahastra"));
        System.out.println(name.remove("Rathkanti"));
        System.out.println(name);
        System.out.println(name.getOrDefault("ram", "not there"));
    }
    

 
    
}
