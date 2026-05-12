public class sarray {
    public static void main(String[] args) {
        int[] numbers={45,12,32,21};
        int smallest=numbers[0];
        for(int number:numbers){
            if(number<smallest){
                smallest=number;

            }
        }
System.out.println("The Smallest number is:"+smallest);
    
int largest=numbers[0];
        for(int number:numbers){
            if(number>largest){
                largest=number;

            }
        }
System.out.println("The Largest number is:"+largest);
    }
}


