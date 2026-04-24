public class switch3  {
    static char Calculator= '+';
    static int a=10;
    static int b=60;
       
public static void main(String[] args){

    switch(Calculator){
case '+':
System.out.println( a+b );   
break;
case '-':
System.out.println( a-b );   
break;
case '*':
System.out.println( a*b);   
break;
case '/':
System.out.println( a/b);   
break;
default:
System.out.println( "invalid" );   
break;

    }
}
}
    
