public class stringOper {
    static String name="Vaishnavi Sriram";
    static String fname="  Krishna Sriram";
    public static void length(){
        System.out.println("length of the name"+": "+name.length());;
 }
public static void uppercase( ) {
    System.out.println(name.toUpperCase());  
}
public static void lowercase( ) {
    System.out.println(name.toLowerCase());  
}
public static void index() {
    System.out.println(name.indexOf("Sriram"));
    }
    public static void charat() {
        System.out.println(name.charAt(9));
        
    }
    public static void whitespace() {
        System.out.println(fname.trim());
        }
        public static void whitespace1() {
        System.out.println(fname);
        }
public static void concat() {
    System.out.println(name+" "+"is a daughter of"+fname);
}
public static void backslash() {
    System.out.println("Sriram\nNavaneetha");
    System.out.println("\tSriram Navaneetha");
    System.out.println("Sriram\\Navaneetha\\");
    System.out.println("Sriram\"Navaneetha\"");
    System.out.println("Sriram\'Navaneetha\'");
    System.out.println("Sri\b\b\bNavaneetha");
}
public static void typecasting() {
    int a=20;
    double b=a;
    System.out.println(b);
    System.out.println(a);
    
}
public static void main(String[] args) {
    length();
    lowercase();
    uppercase();
    index();
    charat();
    whitespace();
    whitespace1();
    concat();
    backslash();
    typecasting();
}
    
}
