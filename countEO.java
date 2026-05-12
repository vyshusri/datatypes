public class countEO {
    public static void main(String[] args) {
        int[] numbers={12,23,45,56,78,89};
    int counteven=0;
    int countodd=0;   
    for(int number:numbers){
        if(number%2==0){
            counteven++;
        }
        else{
            countodd++;
        }
        }
        System.out.println("evennmbers:"+counteven);
        System.out.println("oddnumbes:"+countodd);
    } 
}


