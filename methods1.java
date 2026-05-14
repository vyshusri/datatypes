public class methods1 {
    static int a=3;
    public static void main(String[] args) {
        System.out.println("square of 3:"+square(a));
        System.out.println("cube of 2:"+cube(2));
        System.out.println("largest number:"+largest(34,56));
        
    }
    public static int square(int a){
    return a*a;
    }
     public static int  cube(int b) {
    return b*b*b;
     }
     public static int largest(int c,int d){
        if(c>d){
            return c;
        }
            else{
                return d;
            }
            }
        }
     

