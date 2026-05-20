package polymorphism;

public class Calculator {
    public  int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    
    public static void main(String[] args) {        
Calculator obj=new Calculator();
System.out.println(obj.add(12,13));
System.out.println(obj.add(12.2,13.2));
System.out.println(obj.add(12,13,14));
    }
}
