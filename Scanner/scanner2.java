package Scanner;
import java.util.Scanner;

public class scanner2 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    System.out.print("Enter 2 numbers:");
    float a=sc.nextFloat();
    float b=sc.nextFloat();
    add(a,b);
    }

     public static void add(float a,float b){
    float sum=a+b;
    System.out.println("Sum:"+sum);
    }


    }
    

