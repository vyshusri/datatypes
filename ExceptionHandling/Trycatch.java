package ExceptionHandling;

public class Trycatch {
    public static void main(String[] args) { 

        System.out.println("Before try block");           
        try { 

            System.out.println("dividing"); 

            int result = 10 / 0;                         // Exception 

            System.out.println("Result: " + result);    // SKIPPED 

        } catch (ArithmeticException e) { 
            
            System.out.println("Caught: " + e.getMessage()); 
        } 
        System.out.println("After try-catch block");    
         } 
}


